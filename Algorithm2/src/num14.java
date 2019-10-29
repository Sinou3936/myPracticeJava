public class num14 {
    public static void main(String[] args) {
        int X[] = {1, 1, 0, 0, 0, 0, 0, 0, 0,1};
        int Y[] = {0, 0, 0, 0, 0, 1, 1, 1, 1,0};
        int R[] = new int[10];
        int C = 0;

        for(int K=9;K>=0; K--){
            int S= X[K]+Y[K]+C;
            if(S>=2){
                R[K]= S-2;
                C=1;
            }else{
                R[K]=S;
                C=0;
            }
        }
        System.out.println("이론 확인문제 알고리즘");
        if(C==1){
            System.out.println("OverFlow Error");
        }else
        {
            System.out.print("R[K]의 값:");
            for (int k = 0; k <= 9; k++)
                System.out.print(R[k]);
            System.out.println();
        }
    }
}
