import java.util.Arrays;
import java.util.Scanner;

public class Hyundai_P6 {

    static int seat[];
    static int min, a, b;

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String strSplit[] = str.split(" ");

        for(int i = 0; i < strSplit.length; i++){
            seat[i] = Integer.parseInt(strSplit[i]);
        }

        Arrays.sort(seat);
        min = 0;

        for(int i = 0; i < strSplit.length; i++){
            if(i+1 == strSplit.length){
                break;
            }else if(min > seat[i+1] - seat[i]){
                min = seat[i+1] - seat[i];
                a = i;
                b = i+1;
            }
        }

        System.out.println(seat[a] + " " + seat[b]);

    }
}
