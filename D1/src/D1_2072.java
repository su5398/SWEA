import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class D1_2072 {

    static int T, N, SUM;

    public static void main(String args[]) throws IOException {

       Scanner sc = new Scanner(System.in);
        T = sc.nextInt();

        for(int i = 0; i < T; i++){

            SUM = 0;
            for(int j = 0; j < 10; j++){
                N = sc.nextInt();
                if(N%2 == 1)
                    SUM += N;
            }

            System.out.println("#"+(i+1)+" "+SUM);
        }
    }
}
