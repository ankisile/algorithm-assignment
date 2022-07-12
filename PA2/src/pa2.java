import java.io.*;

public class pa2{
        public static void main(String args[]) throws Exception{
                int i=0, j=0;
                int[][] elements = {{9, 16, 3, 0x7FFFFFFF}, {4, 2, 0x7FFFFFFF, 0x7FFFFFFF}, {8, 5, 0x7FFFFFFF, 0x7FFFFFFF}, {0x7FFFFFFF, 14, 0x7FFFFFFF, 12}};
                int[][] r;

                Matrix mat = new Matrix();
                mat.insertElements(elements);
                r = mat.getMatrix();

                for(i=0;i<4;i++){
                        for(j=0;j<4;j++){
                                if(r[i][j] == 0x7FFFFFFF)       System.out.print("MAX\t");
                                else                            System.out.print(r[i][j] + "\t");
                        }
                        System.out.println();
                }
        }
}