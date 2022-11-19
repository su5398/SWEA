import java.util.Scanner;

public class D3_2806_nQueen {

    static int T, N, count;
    static int map[];

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        T = sc.nextInt();

        for(int tc = 1; tc <= T; tc++){
            N = sc.nextInt();
            map = new int[N]; //map[0](인덱스)이 첫번째 열, 값이 행
            count = 0;
            backtrack(0);
            System.out.println("#"+tc+" "+count);
        }
    }

    public static void backtrack(int row){
        if(row == N){ //row가 N과 같다면 모든 원소를 다 채운 상태(퀸이 N개)
            count++; //퀸을 놓을 수 있는 판의 갯수 추가
            return;
        }
        for(int i = 0; i < N; i++){
            map[row] = i;
            if(isPossible(row)){
                backtrack(row+1);
            }
        }
    }

    public static boolean isPossible(int col){
        for(int i = 0; i < col; i++){
            if(map[col] == map[i]){ //같은 열인지
                return false;
            }
            //열의 차와 행의 차가 같다면 대각선에 놓여있는것이다.
            if(Math.abs(col - i) == Math.abs(map[i] - map[col])){
                return false;
            }
        }
        return true;
    }
}
