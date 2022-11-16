import java.util.Scanner;

public class D2_1204 {

    static int T, C;

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        T =  sc.nextInt();

        for(int i = 0; i < T; i++){
            C = sc.nextInt();
            int[] count = new int[101];

            for(int j = 0; j < 1000; j++){
                int N = sc.nextInt();
                count[N]++;
            }
            int max = 0;
            int result = 0;
            for(int j = 0; j < count.length; j++){
                if(count[j] >= max){
                    max = count[j];
                    result = j;
                }
            }
            System.out.println("#"+C+" "+result);
        }
    }
}
