public class num7 {
    public static void main(String[] args) {
        int A[][] = new int[4][5];
        int V=2;
        int D=1;
        int C1=0 ,C2=4;

        for(int R=0;R<=3; R++){
            for(int C=C1; C!=C2+D; C+=D){
                A[R][C] = V;
                V+=2;
            }
            int Temp = C1;
            C1=C2;
            C2=Temp;
            D=-D;
        }

        System.out.println("이론 확인 문제");
        for(int r=0; r<4; r++){
            for(int c=0;c<5; c++)
                System.out.print(A[r][c]+"\t");
            System.out.println();
        }
    }
}
