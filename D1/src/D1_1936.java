import java.util.Scanner;

public class D1_1936 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
         int A = sc.nextInt();
         int B = sc.nextInt();

         if(A == 1){
             if(B == 2){
                 System.out.println("B");
             }else{
                 System.out.println("A");
             }
         }
         if(A == 2){
             if(B == 1){
                 System.out.println("A");
             }else{
                 System.out.println("B");
             }
         }
         if(A == 3){
             if(B == 1){
                 System.out.println("B");
             }else{
                 System.out.println("A");
             }
         }
    }
}
