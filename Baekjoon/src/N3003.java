import java.util.Scanner;

public class N3003 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int King = sc.nextInt();
        int Queen = sc.nextInt();
        int Rook = sc.nextInt();
        int Bishop = sc.nextInt();
        int Knight = sc.nextInt();
        int Pawn = sc.nextInt();

        System.out.print((1-King) + " " + (1-Queen) + " " + (2-Rook) + " " + (2-Bishop) + " " + (2-Knight) + "" +
                " " + (8-Pawn));

    }
}
