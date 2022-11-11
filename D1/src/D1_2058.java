import java.util.Scanner;

public class D1_2058 {

    static int sum;

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String num = sc.next();
        String numsplit[] = num.split("");

        for(int i = 0; i < 4; i++){
            sum += Integer.parseInt(numsplit[i]);
        }
        System.out.println(sum);

    }
}
