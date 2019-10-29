public class num11 {
    public static void main(String[] args) {
        int T[] = {1,1,1,1,0,1,1,0};
        int C[] = new int[8];
        int D=0, SIGN=1;

        if(T[1]!=0){
            SIGN =-1;
            int B=1;
            for(int K=7;K>=1; K--){
                C[K] = T[K]-B;
                if(T[K]!=0 || B!=1)
                    B=0;
                C[K] = Math.abs(C[K]);
                T[K] = 1-C[K];
            }
        }
        for(int K=1; K<=7; K++){
            int T1 =(int)Math.pow(2,7-(double)K);
            int T2 = T[K]*T1;
            D +=T2;
        }
        D*=SIGN;
        System.out.println("10진수와 2진수 변환");
        System.out.println(D);
    }
}
