import java.util.Scanner;

class objectarr {
     public static void main(String[] a) {
         Scanner in =new Scanner(System.in);
         int[] arr=new int[6];
         for(int i=0;i<6;i++)
         {
             int x=in.nextInt();
             arr[i]=x;
         }
         for(int num:arr)
         System.out.println(num+" ");



        
    }
}
