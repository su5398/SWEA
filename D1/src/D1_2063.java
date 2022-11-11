import java.util.Arrays;
import java.util.Scanner;

public class D1_2063 {

    public static void main(String args[]){

        int N;

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        int[] num = new int[N];
        for(int i = 0; i < N; i++){
            num[i] = sc.nextInt();
        }

        Arrays.sort(num);

        System.out.println(num[N/2]);

    }
}
