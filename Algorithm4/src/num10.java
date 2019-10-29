public class num10 {
    public static void main(String[] args) {
      int Y[] = {100,120,140,160,180,300,210,150,270,320};
      int S[][] = new int[10][12];
      int R[] = new int[10];

      for(int i=0; i<10; i++){
          for(int j=0; j<12; j++){
              Y[i] = Y[i]+S[i][j];
          }
      }
      for(int i=0; i<10; i++){
          R[i] = 1;
          for(int k=0; k<10; k++){
              if(Y[i]<Y[k]){
                  R[i] = R[i]+1;
              }
          }
      }
        System.out.println("예상문제 알고리즘 1(사원 연봉 순위)");
        for(int i=0; i<10; i++)
          System.out.print(R[i]+"\t");
        System.out.println();

    }
}
