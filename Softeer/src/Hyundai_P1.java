import java.util.Scanner;

public class Hyundai_P1 {

    static int N;
    static int image[][];
    static StringBuilder sb = new StringBuilder();

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        image = new int[N][N];

        for(int i = 0; i < N; i++){
            String str = sc.next();
            for(int j = 0; j < N; j++){
                image[i][j] = str.charAt(j) - '0';
            }
        }

        QuadTree(0, 0, N);
        System.out.println(sb);
    }

    public static void QuadTree(int x, int y, int length){

        if(Possible(x, y, length)){
            sb.append(image[x][y]);
            return;
        }

        int halfLength = length/2;

        sb.append("(");
        QuadTree(x, y, halfLength);
        QuadTree(x, y + halfLength, halfLength);
        QuadTree(x + halfLength, y, halfLength);
        QuadTree(x + halfLength, y + halfLength, halfLength);
        sb.append(")");
    }

    public static boolean Possible(int x, int y, int length){
        int value = image[x][y];

        for(int i = x; i < x + length; i++){
            for(int j = y; j < y + length; j++){
                if(value != image[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
}
