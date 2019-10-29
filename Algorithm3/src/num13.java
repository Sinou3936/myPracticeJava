public class num13 {
    public static void main(String[] args) {
        char A[][] = {{'A','B','C','D','E'},
                {'F','G','H','I','J'},
                {'K','L','M','N','O'},
                {'P','Q','R','S','T'},
                {'U','V','W','X','Y'}};
        char B[][] = new char[5][5];
        char C[][] = new char[5][5];
        int M,N;

        for(int r=0;r<5; r++) {
            M=4-r;
            for (int c = 0; c < 5; c++) {
                    N=4-c;
                B[M][N] = A[r][c];
            }
        }
        for(int r=0;r<5; r++) {
            for (int c = 0; c < 5; c++) {
                M=4-r;
                C[M][c] = A[r][c];
            }
        }
        System.out.println("180도 회전");
        for(int r=0;r<5; r++){
            for(int c=0; c<5; c++)
                System.out.print(B[r][c]+"\t");
            System.out.println();
        }
        System.out.println();
        System.out.println("270도 회전");
        for(int r=0;r<5; r++){
            for(int c=0; c<5; c++)
                System.out.print(C[r][c]+"\t");
            System.out.println();
        }
    }
}
