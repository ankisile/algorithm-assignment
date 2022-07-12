public class grid{
        private int n;
        long result;

// Declare more variables here if you need...
        int [][] checked;
        int dx[] = {-1,0,1,0};
        int dy[] = {0,1,0,-1};
        long count=0;

        public grid(int n){
                this.n = n;
                this.result = 0;
        }
        long numOfWays(){
                result = 0;
                checked = new int [n+1][n+1]; //간 길 표시
                goToN(0,0); // (0,0)에서부터 시작
                result = count;
                return result;
        }
        void goToN(int x, int y) {

                int cx, cy;

                checked[x][y]=1;

                if(x==n&&y==n) {
                        count++;
                }
                else{
                /*
                        for(int i=0;i<4;i++){
                                cx=x+dx[i];
                                cy=y+dy[i];
                                if(cx>=0&&cx<=n&&cy>=0&&cy<=n){
                                        if(checked[cx][cy]==0){
                                                goToN(cx,cy);
                                        }
                                }
                        }
                */
                        if((x+1!=n+1)&&checked[x+1][y]==0)
                                goToN(x+1,y);
                        if((y+1!=n+1)&&checked[x][y+1]==0)
                                goToN(x,y+1);
                        if((x-1!=-1)&&checked[x-1][y]==0)
                                goToN(x-1,y);
                        if((y-1!=-1)&&checked[x][y-1]==0)
                            goToN(x,y-1);

            }
            checked[x][y]=0;

    }
//Define more functions here if you need...

}
