import java.util.Scanner;

public class D2_2001 {

    static int T, N, M, sum, max;

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        T = sc.nextInt();

        for(int i = 0; i < T; i++){

            N = sc.nextInt();
            M = sc.nextInt();

            int[][] map = new int[N][N];

            for(int a = 0; a < map.length; a++){
                for(int b = 0; b < map.length; b++){
                    map[a][b] = sc.nextInt();
                }
            }

            max = 0;

            for(int a = 0; a <= N-M; a++){
                for(int b = 0; b <= N-M; b++){
                    sum = 0;
                    for(int x = 0; x < M; x++){
                        for(int y = 0; y < M; y++){
                            sum += map[a+x][b+y];
                        }
                    }
                    max = Math.max(max, sum);
                }
            }

            System.out.println("#"+(i+1)+" "+max);

        }
    }
}
