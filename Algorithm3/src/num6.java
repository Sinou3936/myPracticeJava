public class num6 {
    public static void main(String[] args) {
        int A[][] = new int[5][5];
        int V=1;
        int D=1;
        int C1=0,C2=4;

        for(int R=0; R<=4;R++){
            for(int C=C1;C!=C2+D;C+=D){
                A[R][C]=V;
                V+=1;
            }
            int Temp = C1;
            C1=C2;
            C2=Temp;
            D=-D;
        }
        System.out.println("'ㄹ'자 모양 으로 배열 채우기");
        for(int r=0; r<5; r++){
            for(int c=0; c<5; c++)
                System.out.print(A[r][c]+"\t");
            System.out.println();
        }
        System.out.println();
        for(int r=0; r<5; r++){
            for(int c=0; c<5; c++)
                System.out.print(A[c][r]+"\t");
            System.out.println();
        }
    }
}
