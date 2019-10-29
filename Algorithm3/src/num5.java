public class num5 {
    public static void main(String[] args) {
        int A[][] =new int[5][5];
        int V=1;
        int M=2;
        int CL=M, CR=M;

        for(int R=0;R<=4; R++){
            for(int C=CL; C<=CR;C++){
                A[R][C] =V;
                V+=2;
            }
            if(R<M){
                CL--;
                CR++;
            }else{
                CL++;
                CR--;
            }
        }
        System.out.println("마름모 모양으로 배열채우기");
        for(int r=0; r<5; r++){
            for(int c=0; c<5; c++)
                System.out.print(A[r][c]+"\t");
            System.out.println();
        }
    }
}
