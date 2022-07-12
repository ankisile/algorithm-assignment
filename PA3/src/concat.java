import java.io.*;

public class concat{
        private pri[] pa;

// Define additional variables or functions if you need...

        public concat(){
                this.pa = null;
        }

        public concat(int[] priority, String[] words){
                int i = 0, n = priority.length;
                this.pa = new pri[n];
                for(i=0;i<n;i++)        this.pa[i] = new pri(priority[i], words[i]);
                return;
        }

        public String concatenate(){
                String result = "";
                
                // Insert source code here...
                int num=pa.length;
                int mid=(num/2);
                int idx;
                String word;
                
                
                //해시테이블 이용
                
                
                return result;
        }
        
        
                
                
                
                
//                for(int i=0;i<pa.length;i++){//i는 우선순위
//                	word = getpri(i);
//                	result += word;
//
////                	if(pa[idx].pr < mid) {
////                		result += "-";
////                	}
////                	else {
////                		result += pa[idx].word;
////                	}
////                	result += " ";
//                }
//                result = result.substring(0, result.length()-1);
//                return result;
        
        
        
        
        public String getpri(int pr) { 
        	//순서 바꾸면 안되는거 아닌가?
        	String word = "";
//        	pri arr[]= new pri[pa.length];
//        	int idx=0;
        	for(int i=0;i<pa.length;i++) {
        		if(pr==pa[i].pr) {
        			if(i<(pa.length/2)) {
        				word += "-";
        			}
        			else {	
        				word += pa[i].word; //arr[idx++]=pa[i];
        			}
        			word += " ";
        		}
        	}
//        	if(idx>0) {
//        		for(int i=0;i<idx;i++) {
//        			word += pa[i].word;
//        			word+=" ";
//        		}
//        	}
        	return word;
        }
        
        
        /*
        
        public int partition(int l, int r) {
        	int x = pa[r].pr;
        	int i = l-1;
        	pri temp;
        	for(int j=l;j<r;j++) {
        		if(pa[j].pr<=x) {
        			i=i+1;
        			temp = pa[i];
        			pa[i]=pa[j];
        			pa[j]=temp;
        		}
        	}
        	temp = pa[i+1];
			pa[i+1]=pa[r];
			pa[r]=temp;
        	return i+1;
        }
        */
        /*
        public pri select(int l, int r, int i) {
        	if(l==r) return pa[l];
        	int q = partition(l,r);
        	int k=q-l;
        	if(i==pa[k].pr) return pa[q];
        	else if(i<pa[k].pr) return select(l,q-1,i);
        	else return select(q+1,r,i-k-1);
        }
        public int partition(int l, int r) {
        	int x = pa[r].pr;
        	int i = l-1;
        	pri temp;
        	for(int j=l;j<r;j++) {
        		if(pa[j].pr<=x) {
        			i=i+1;
        			temp = pa[i];
        			pa[i]=pa[j];
        			pa[j]=temp;
        		}
        	}
        	temp = pa[i+1];
			pa[i+1]=pa[r];
			pa[r]=temp;
        	return i+1;
        }
        */
}
