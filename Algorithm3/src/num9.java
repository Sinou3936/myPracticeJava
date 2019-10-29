public class num9 {
    public static void main(String[] args) {
        char A[][] = {{'A','B','C','D','E'},
                {'F','G','H','I','J'},
                {'K','L','M','N','O'},
                {'P','Q','R','S','T'},
                {'U','V','W','X','Y'}};
        char B[][] = new char[5][5];
        char C[][] = new char[5][5];

        int n, m;
        for(int r=0;r<5; r++){
            for(int c=0; c<5; c++) {
                n = 4- r;
                B[c][n] = A[r][c];
            }
        }

        for(int r=0;r<5; r++){
            m=4-r;
            for(int c=0; c<5; c++){
                n=4-c;
                C[m][n] = A[r][c];
            }
        }
        System.out.println("배열 회전시키기");
        for(int r=0; r<5; r++){
            for(int c=0; c<5; c++)
                System.out.print(A[r][c]+"\t");
            System.out.println();
        }
        System.out.println("=======================");
        System.out.println("90도 회전");
        for(int r=0; r<5; r++){
            for(int c=0; c<5; c++)
                System.out.print(B[r][c]+"\t");
            System.out.println();
        }
        System.out.println();
        System.out.println("180도 회전");
        for(int r=0; r<5; r++){
            for(int c=0; c<5; c++)
                System.out.print(C[r][c]+"\t");
            System.out.println();
        }
    }
}
