import java.util.Scanner;

public class D3_1206 {

    static int N, sum, max;
    static int building[];

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        for(int tc = 1; tc <= 10; tc++){
            N = sc.nextInt();
            building = new int[N];

            for(int i = 0; i < N; i++){
                building[i] = sc.nextInt();
            }

            sum = 0;

            for(int i = 2; i < N-2; i++){
                max = Math.max(building[i+2], Math.max(building[i+1], Math.max(building[i-2], building[i-1])));
                if(building[i] - max > 0){
                    sum += building[i] - max;
                }
            }

            System.out.println("#"+tc+" "+sum);

        }
    }
}
