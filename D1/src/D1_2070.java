import java.util.Scanner;

public class D1_2070 {

    static int T, A, B;

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();

        for(int i =0; i < T; i++){
            A = sc.nextInt();
            B = sc.nextInt();
            if(A>B){
                System.out.println("#"+(i+1)+" "+">");
            }else if(A<B){
                System.out.println("#"+(i+1)+" "+"<");
            }else{
                System.out.println("#"+(i+1)+" "+"=");
            }
        }
    }
}
