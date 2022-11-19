import java.util.Scanner;
import java.util.Vector;

public class D2_1954_아직 {

    static int T, N;
    static int x[] = {1, -1, 0, 0};
    static int y[] = {0, 0, 1, -1};
    static boolean Visited[][];
    static int map[][];

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        T = sc.nextInt();

        for(int i = 0; i < T; i++){
            N = sc.nextInt();
            map = new int[N][N];

            int num = 1;
            int startX = 0;
            int startY = 0;
            int endX = N-1;
            int endY = N-1;

            while(num <= N*N){
                for(int j = startY; j <= endY; j++){ //오른쪽에서 왼쪽
                    map[startX][j] = num;
                    num++;
                }
                startX++;

                for(int j = startX; j <= endX; j++){//위에서 아래
                    map[j][endY] = num;
                    num++;
                }
                endY--;

                for(int j = endY; j >= startY; j--){ //왼쪽에서 오른쪽
                    map[endX][j] = num;
                    num++;
                }
                endX--;

                for(int j = endX; j >= startX; j--){ //아래에서 위
                    map[j][startY] = num;
                    num++;
                }
                end

            }



        }

    }
}
