import java.util.Scanner;

public class D1_2071 {

    static double T, N, SUM, R;

    public static void main(String args[]) {

         Scanner sc = new Scanner(System.in);

         T = sc.nextInt();

         for(int i = 0; i < T; i++){

            SUM = 0;

             for(int j = 0; j < 10; j++){

                 N = sc.nextInt();
                 SUM += N;

             }

             R = SUM/10;

             System.out.println("#" + (i+1) + " " + Math.round(R));
         }
    }
}







