import java.io.*;

public class pa1{
        public static void main(String args[]) throws Exception{
                int[] array = {66, 239, -87, 0, 155, 157, -121, 141, 252, 14, 202, 232, 80, 190, 62, 166, 54, 252, 191, -115, -127, 108, 169
                };
                findSum fs = new findSum(array);

                if(fs.find(373) == 1)   System.out.println("Exist!");
                else                    System.out.println("Not exist!");

                if(fs.find(107) == 1)   System.out.println("Exist!");
                else                    System.out.println("Not exist!");
        }
}

