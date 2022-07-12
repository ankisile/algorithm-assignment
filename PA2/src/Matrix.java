import java.io.*;

public class Matrix{
        private int[][] element;
        int pos=0;

        // Declare additional variables here if you need...

        // DO NOT modify below three functions Matrix(), getMatrix(), and clearMatrix()
        public Matrix(){
                element = null;
        }

        public int[][] getMatrix(){
                return element;
        }

        public void clearMatrix(){
                int i=0, m;
                if(element == null)     return;
                m = element.length;
                for(i=0;i<m;i++)        element[i] = null;
                element = null;
        }

        public void insertElements(int[][] _e){
            element = new int[_e.length][_e[0].length];
            int tempArr [] =new int[_e[0].length*_e.length];
            
            for(int i=0;i<_e.length;i++) {
                insert(_e[i], i, tempArr);
            }
          
            int min;
            for(int i=0;i<tempArr.length;i++) {
                min=extractMin(tempArr, i);
                element[i/_e[0].length][i%_e[0].length]=min;

            }
            
        }

        // Define additional functions here if you need...
        
        public void insert(int a[], int row, int arr[]) {
            int temp=0;
            int min;
            int now;
            for(int i=0;i<a.length;i++) {
                    arr[pos]=a[i];
                    now=pos;
                    pos++;
                    while(now>0&&arr[(now-1)/2]>arr[now]) {
                            temp=arr[now];
                            arr[now]=arr[(now-1)/2];
                            arr[(now-1)/2]=temp;
                            now=(now-1)/2;
                    }
            }     

    }

        public int extractMin(int a[], int i) {
        	int min = a[0];
        	int size=a.length-i;
        	a[0]=a[size-1];
        	a[size-1]=0x7FFFFFFF;
        	minHeapify(a,0,size);
        	
//        	int idx = 0;
//        	int left;
//        	while (true) { 
//        		left = 2*idx+1;
//        		if (left<size && a[left]>a[left+1]) 
//        			left++; 
//        		if (left>size || a[left]>a[idx]) 
//        			break; 
//        		int tmp = a[idx]; 
//        		a[idx]=a[left]; 
//        		a[left]=tmp; 
//        		idx=left; 
//        	} 

        	return min;
        }
        
        public void minHeapify(int a[],int i,int size) {
        	int left = 2*i+1;
        	int right = 2*i+2;
        	int smallest;
        	int temp;
        	if(left<size&&a[i]>a[left]) {
        		smallest=left;
        	}
        	else smallest=i;
        	if(right<size&&a[smallest]>a[right]) {
        		smallest=right;
        	}
        	if(smallest!=i) {
        		temp=a[i];
    			a[i]=a[smallest];
    			a[smallest]=temp;
    			minHeapify(a, smallest,size);
        	}
        	
        }
        
}
