public class num3 {
    public static void main(String[] args) {
        int a[][] =new int[5][5];
        int v=1;
        int m=3;
  /*    //모래시계 모형
        for(int r=0; r<m; r++){
            for(int c=r; c<(5-r); c++){
                a[r][c]= v;
                v++;
            }
        }
        for(int r=m; r<=4; r++){
            for(int c=(4-r);c<=r; c++){
                a[r][c]=v;
                v++;
            }
        }*/
  // 옆으로 누워있는 모래시계 모형
        for(int c=0; c<m; c++){
            for(int r=c; r<(5-c); r++){
                a[r][c]= v;
                v++;
            }
        }
        for(int c=m; c<=4; c++){
            for(int r=(4-c);r<=c; r++){
                a[r][c]=v;
                v++;
            }
        }


        System.out.println("모래시계모양으로 배열 채우기");
        for(int r=0; r<5; r++){
            for(int c=0; c<5; c++)
                System.out.print(a[r][c]+"\t");
            System.out.println();
        }
    }
}
