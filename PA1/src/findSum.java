import java.io.*;

public class findSum{
        private int[] S;
        // You can declare additional variables here if you need...
        private int[] sorted;
        
        public findSum(){
                S = null;
        }

        public findSum(int[] s){
                setArray(s);
        }

        public void setArray(int[] s){
                int i=0, n = s.length;
                S = null;
                S = new int[n];
                for(i=0;i<n;i++)        S[i] = s[i];
        }

        public void showArray(){
            int i=0, n = S.length;
            for(i=0;i<n;i++)        System.out.print(S[i] + " ");
            System.out.println();
	    }
	
	    public int find(int x){
	    
	    	int n = S.length;
	    	int start = 0;
	    	int end = n-1;
	    	
	    	int max=0, min=0;    	
	    	int i,idx=0;
	    	int temp [] = new int[n];
	    	for(i=0;i<S.length;i++) {
	    		if(i==0) max=min=S[i];
	    		else {
	    		if(S[i]>max) max=S[i];
	    		if(S[i]<min) min=S[i];
	    		}
	    	}
	    	
	    	//필요없는 경우 모두 고려하기
	    	if(x<min&&x>0) { //0<x<min 
	    		return 0;
	    	}
	    	else if(x>max&&x<0) //max<x<0
	    		return 0;
	    	else if(x<0&&min>0) //x<0 min>0
	    		return 0;
	    	else if(x>0&&max<0) //x>0 max<0
	    		return 0;
	    	
	    	//x가 min보다 작을때 min이 0보다 작은데 max가 0보다 클때
	    	if(x<min&&min<0&&max>0) { //x<min<0 max>0
	    		for(i=0;i<S.length;i++) {
	    			if(S[i]<=0) {
	    				temp[idx++]=S[i];
	                    int arrsize=temp.length;
	                    for(int k=1;k<arrsize;k++) {
	                            int key= temp[k];
	                            int j=k-1;
	                            while(j>=0&&temp[j]>key) {
	                                    temp[j+1]=temp[j];
	                                    j--;
	                            }
	                            temp[j+1]=key;
	                    
	    			}
	    		}
	    		sorted= new int[idx];
	    		for(i=0;i<idx;i++) {
	    			sorted[i]=temp[i];
	    		}
	    		end=idx-1;

	    		}
	    	}
	    	else if(x>max&&max>0&&min<0) {
	    		for(i=0;i<S.length;i++) {
	    			if(S[i]>=0) {
	    				temp[idx++]=S[i];
	    				int arrsize=temp.length;
	                    for(int k=1;k<arrsize;k++) {
	                            int key= temp[k];
	                            int j=k-1;
	                            while(j>=0&&temp[j]>key) {
	                                    temp[j+1]=temp[j];
	                                    j--;
	                            }
	                            temp[j+1]=key;
	    			}
	    		}
	    		sorted= new int[idx];
	    		for(i=0;i<idx;i++) {
	    			sorted[i]=temp[i];
	    		}
	    		end=idx-1;
	    	}
	    	else {
	    		sorted=new int [n];
	    		for(i=0;i<S.length;i++) {
	    			sorted[i]=S[i];
	    		}
	    	}
	    
	    	qsort(sorted, start, end);
	    	while(start<end) {
	    		if(sorted[start]+sorted[end]==x)
		    		return 1;
	    		else if(sorted[start]+sorted[end]>x)
	    			end--;
	    		else
	    			start++;
	    	}
	    	
	    	
	    	
	        return 0;
	    }
	    public void qsort(int[] s, int start, int end) {
            if(s.length<7) {
                    int arrsize=s.length;
                    for(int i=1;i<arrsize;i++) {
                            int key= s[i];
                            int j=i-1;
                            while(j>=0&&s[j]>key) {
                                    s[j+1]=s[j];
                                    j--;
                            }
                            s[j+1]=key;
                    }
                    return;
            }
            if(start<end) {

                    int pivot=partition(s, start, end);



                    qsort(s, start, pivot);
                    qsort(s, pivot + 1, end);
                    int mid = (start+end)/2;
    	    		mergeSort(s, start,mid);
    	    		mergeSort(s,mid+1,end);
    	    		
    	    		int temp[] = new int[end - start + 1];
    
    	    		int i = start, j = mid+1, idx = 0;
    
    	    		while(i <= mid && j <= end) {
    	    			if(s[i] < s[j]) {
    	    				temp[idx] = s[i];
    	    				 i++;
    	    			}
    	    			else {
    	    				temp[idx] = s[j];
    	    				j++;
    	    			}
    	    			idx++;
    	    		}
    
    	    		while(i <= mid) {
    	    			temp[idx] = s[i];
    	    			idx++;i++;
    	    		}
    
    	    		while(j <= end) {
    	    			temp[idx] = s[j];
    	    			idx++; j ++;
    	    		}
    
    	    		for(i = start; i <= end; i += 1) {
    	    			s[i] = temp[i - start];
    	    		}
            }
     }
     private static int partition(int[] a, int left, int right) {

                    int lo = left - 1;
                    int hi = right + 1;
                    int pivot = a[(left + right) >>>1];


                    while(true) {

                            do {
                                    lo++;
                            } while(a[lo] < pivot);


                            do {
                                    hi--;
                            } while(a[hi] > pivot && lo <= hi);
                            if(lo >= hi) {
                                    return hi;
                            }

                            int temp = a[lo];
                            a[lo] = a[hi];
                            a[hi] = temp;
                    }

            }
	  
	   
}
	  

