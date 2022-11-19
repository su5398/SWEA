import java.util.Arrays;
import java.util.Scanner;

public class pre_test {

    static int N, count, size;
    static int dx[] = {1, -1, 0, 0};
    static int dy[] = {0, 0, 1, -1};
    static boolean visited[][];
    static int map[][];
    static int result[];

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();

        map = new int[N][N];
        visited = new boolean[N][N];
        result = new int [N*N];

        for(int i = 0; i < map.length; i++){
            for(int j = 0; j < map.length; j++){
                map[i][j] = sc.nextInt();
            }
        }

        count = 0;
        size = 0;

        for(int i = 0; i < map.length; i++){
            for(int j = 0; j < map.length; j++){
               if(!visited[i][j] && map[i][j] == 1){
                    dfs(i, j);
                    count++;
                    result[i+j] = size;
               }
            }
        }

        Arrays.sort(result);

        if(count == 0){
            System.out.print(count);
        }else{
            System.out.println(count);
            for(int i = 0; i < result.length; i++){
                if(result[i] != 0){
                    System.out.print(result[i]+" ");
                }
            }
        }


    }
    public static void dfs(int x, int y){
        visited[x][y] = true;
        size++;

        for(int i = 0; i < 4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx > 0 && ny > 0 && nx < N && ny < N){
                if(!visited[nx][ny] && map[nx][ny] == 1){
                    dfs(nx, ny);
                }
            }
        }
    }

}
