public class num14 {
    public static void main(String[] args) {
       int A[][] = new int[5][5];
       int k=0;
       int C= 3;
       int S,F;
      for(int j=4; j>-1; j--){
          if(j<C){
              S=j;
              F=4-j+1;

          }else{
              S=4-j+1;
              F=j;
          }
          for(int q=S; q<F; q++){
              k+=2;
              A[q][j] = k;
          }
      }
       for(int r=0; r<5; r++){
           for(int c=0; c<5; c++)
               System.out.print(A[r][c]+"\t");
           System.out.println();
       }
    }
}
