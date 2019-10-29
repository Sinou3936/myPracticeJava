public class num11 {
    public static void main(String[] args) {
        int A[][] = {{5,7,-3,4},{2,-10,3,12},{7,6,9,4}};
        int B[] = {2,-2,3,5};
        int C[][] = new int[3][4];
        int D[][] = new int[3][4];
        int E[][] = new int[3][4];

        for(int r=0; r<3; r++){
            for(int c=0; c<4; c++){
                C[r][c]=0;
                C[r][c] = A[r][c]+B[c];
            }
        }
        for(int r=0; r<3; r++){
            for(int c=0; c<4; c++){
                D[r][c]=0;
                D[r][c] =D[r][c]+A[r][c]-B[c];
            }
        }
        for(int r=0; r<3; r++){
            for(int c=0; c<4; c++){
                E[r][c]=0;
                E[r][c] =E[r][c]+A[r][c]*B[c];
            }
        }
        System.out.println("예상문제 2");
        System.out.println("행렬 덧셈");
        for(int r=0; r<3; r++){
            for(int c=0; c<4; c++)
                System.out.print(C[r][c]+"\t");
            System.out.println();
        }
        System.out.println();
        System.out.println("행렬 뺄셈");
        for(int r=0; r<3; r++){
            for(int c=0; c<4; c++)
                System.out.print(D[r][c]+"\t");
            System.out.println();
        }
        System.out.println();
        System.out.println("행렬 곱셈");
        for(int r=0; r<3; r++){
            for(int c=0; c<4; c++)
                System.out.print(E[r][c]+"\t");
            System.out.println();
        }
    }
}
