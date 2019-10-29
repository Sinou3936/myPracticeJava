public class num4 {
    public static void main(String[] args) {
        int P=2, N=3;
        while (true) {
            double temp = Math.sqrt(N);
            int m = (int)temp;
            for(int i=2; i<=m; i++) {
                int R = N % i;
                if (R == 0)
                    break;
                if (i == m)
                    P = N;
            }
            N++;
            if(N>100)break;
        }
        System.out.println("소수판별 알고리즘");
        System.out.println(P);
    }
}
