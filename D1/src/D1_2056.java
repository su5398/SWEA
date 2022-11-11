import java.util.Scanner;

public class D1_2056 {

    static int T;
    static String input;
    static int Mdays[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        T = sc.nextInt();

        for(int i = 0; i < T; i++){
            input = sc.next();

            int month = Integer.parseInt(input.substring(4,6));
            int day = Integer.parseInt(input.substring(6,8));

            if(month > 0 && month < 13 && day < Mdays[month]+1){
                System.out.println("#" + (i+1) + " " + input.substring(0,4) + "/" + input.substring(4,6) + "/" + input.substring(6,8));
            }
            else{
                System.out.println("#"+(i+1) + " " + -1);
            }

        }

    }
}
