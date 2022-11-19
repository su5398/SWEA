import java.util.Scanner;

public class D2_1859 {

    static int T, N;

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        T = sc.nextInt();

        for(int tc = 0; tc < T; tc++){
            N = sc.nextInt();

            int price[] = new int[N];

            for(int i = 0; i < N; i++){
                price[i] = sc.nextInt();
            }

            long sum = 0;
            int max = 0;

            for(int i = N-1; i >= 0; i--){
                if(max < price[i]){
                    max = price[i];
                }else{
                    sum += max -price[i];
                }
            }

            System.out.println("#"+(tc+1)+" "+sum);
        }
    }
}
