public class num10 {
    public static void main(String[] args) {
        int A[][] = {{5,7,-3,4},{2,-5,3,6}};
        int B[][] = {{3,0,8},{-5,1,-1},{7,4,4},{2,4,3}};
        int C[][] = new int[2][3];
        int D[][] = new int[2][3];
        int E[][] = new int[2][3];

        for(int i=0; i<=1; i++){
            for(int j=0; j<=2; j++) {
                C[i][j] = 0;
                for (int k = 0; k <= 3; k++) {
                    C[i][j] = C[i][j]+A[i][k]*B[k][j];
                }
            }
        }
        for(int i=0; i<=1; i++){
            for(int j=0; j<=2; j++) {
                D[i][j] = 0;
                for (int k = 0; k <= 3; k++) {
                    D[i][j] = D[i][j]+A[i][k]-B[k][j];
                }
            }
        }
        for(int i=0; i<=1; i++){
            for(int j=0; j<=2; j++) {
                E[i][j] = 0;
                for (int k = 0; k <= 3; k++) {
                    E[i][j] = E[i][j]+A[i][k]+B[k][j];
                }
            }
        }
        System.out.println("행렬 곱셈 계산하기");

        for(int r=0; r<=1; r++){
            for(int c=0; c<=2; c++)
                System.out.print(C[r][c]+"\t");
            System.out.println();
        }
        System.out.println();
        System.out.println("행렬 뺄셈");
        for(int r=0; r<=1; r++){
            for(int c=0; c<=2; c++)
                System.out.print(D[r][c]+"\t");
            System.out.println();
        }
        System.out.println();
        System.out.println("행렬 덧셈");
        for(int r=0; r<=1; r++){
            for(int c=0; c<=2; c++)
                System.out.print(E[r][c]+"\t");
            System.out.println();
        }
    }
}
