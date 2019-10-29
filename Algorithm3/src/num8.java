public class num8 {
    public static void main(String[] args) {
        int S[][] = new int[5][5];
        int R=0;
        int C=2;

        for(int N=1; N<=25; N++){
            S[R][C]=N;
            int NR = R-1;
            int NC = C+1;
            if(NR==-1)
                NR=4;
            if(NC==5)
                NC=0;
            if(S[NR][NC] == 0){
                R=NR;
                C=NC;
            }else
                R++;
        }
        System.out.println("마방진 배열 채우기");
        for(int r=0; r<5; r++){
            for(int c=0; c<5; c++)
                System.out.print(S[r][c]+"\t");
            System.out.println();
        }
    }
}
