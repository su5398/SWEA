import java.util.Scanner;

public class D1_2068 {

    static int T,max, input;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        T = sc.nextInt();

        for(int i = 0; i < T; i++){
            max = 0;
            for(int j = 0; j < 10; j++){
                input = sc.nextInt();
                if(max < input){
                    max = input;
                }
            }
            System.out.println("#"+(i+1)+" "+max);

        }
    }
}
