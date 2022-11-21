import java.util.Scanner;

class P1{

    static int T, m, M, N, count, ymax, ymove, xmin, xmax, xmove, a, b;
    static int map[];

    public static void main(String args[]) throws Exception{
        Scanner sc = new Scanner(System.in);

        T = sc.nextInt();

        for(int tc = 1; tc <= T; tc++) {
            m = sc.nextInt();
            N = sc.nextInt();
            M = m*m+2;


            map = new int[M];

            for(int i = 0; i < N; i++) {
                int y = sc.nextInt();
                int x = sc.nextInt();
                map[y] = x; //인덱스가 y축, 원소가 x축
            }

            ymax = 0;
            xmin = m+1;
            xmax = 0;
            a=0;
            b=0;

            for(int i = 0; i < M; i++) {
                if(map[i] > 0 && ymax < i) {
                    ymax = i;
                }

                if(map[i] > 0 && xmax < map[i]) {
                    xmax = map[i];
                }

                if(map[i] > 0 && xmin > map[i]) {
                    xmin = map[i];
                }
            }
            ymove = ymax-1;

            if((xmax-1) > (m-xmax)) {
                a = m-xmax;
            }else if((xmin -1) < (m-xmin)){
                b = xmin -1;
            }
            if(a >= b) {
                xmove = a;
            }else {
                xmove = b;
            }
            System.out.println("#"+tc+" "+(xmove+ymove));
        }
    }
}