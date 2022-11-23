import java.util.Scanner;

public class D2_1989 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for(int tc = 1; tc <= T; tc++){
            String str = sc.next();

            int result = 0;

            for(int i=0; i<str.length()/2+1; i++) {
                if(str.charAt(i) != str.charAt(str.length()-i-1)) {
                    result = 0;
                }else{
                    result = 1;
                }
            }

            System.out.println("#"+tc+" "+result);
        }

    }
}
