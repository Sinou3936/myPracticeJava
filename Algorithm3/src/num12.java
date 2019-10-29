public class num12 {
    public static void main(String[] args) {
        int A[][] = {{5,7,-3,4},{2,-10,3,12},{7,6,9,4}};
        int B[][] = {{3,0,8,8},{-5,1,9,7},{13,4,4,5}};
        int C[][] = new int[3][4];

        for(int r=0; r<3; r++){
            for(int c=0; c<4; c++){
                C[r][c]=0;
                C[r][c] = A[r][c]+B[r][c];
            }
        }

        System.out.println("예상문제 4");
        for(int r=0; r<3; r++){
            for(int c=0; c<4; c++)
                System.out.print(C[r][c]+"\t");
            System.out.println();
        }
    }
}
