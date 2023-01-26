import java.util.Scanner;

public class N2884 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int time = sc.nextInt();
        int min = sc.nextInt();

        if(min >= 45){
            min -= 45;
        }else{
            min = 60-(45 - min);
            if(time > 0){
                time -= 1;
            }else{
                time = 23;
            }
        }

        System.out.print(time + " " + min);
    }
}
