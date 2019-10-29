public class num2 {
    public static void main(String[] args) {
        int a[][] =new int[5][5];
        int v=2;

      //1~15 순서대로
       for(int r=0; r<5; r++){
            for(int c=r; c<5; c++){
                a[r][c]=v;
                v++;
            }
        }
/* 제곱 값 순서대로

        for(int r=0; r<5; r++){
            for(int c=r; c<5; c++){
                a[r][c]=v*v;
                v++;
            }
        }
*/

/* 16-V를 뺀 순서대로
        for(int r=0; r<5; r++){
            for(int c=r; c<5; c++){
                a[r][c]=16-v;
                v++;
            }
        }
*/

 /* a(r,c) =v 를 c로 변경
        for(int r=1; r<=5; r++){
            for(int c=r; c<5; c++){
                a[r][c]=c;
            }
        }
*/

/* a(r,c)=v 를 a(c,r)=v롤 변경
        for(int r=0; r<5; r++){
            for(int c=r; c<5; c++){
                a[c][r]=v;
                v++;
            }
        }
*/

/* v+1를 v+2로 하여 홀수로 변경
        for(int r=0; r<5; r++){
            for(int c=r; c<5; c++){
                a[r][c]=v;
                v+=2;
            }
        }
*/

/*  +,- 부호 변경
        for(int r=0; r<5; r++){
            for(int c=r; c<5; c++){
                a[r][c]=v;
                v =-v;
            }
        }
*/

 /* 홀수에서 짝수로 변경
        for(int r=0; r<5; r++){
            for(int c=r; c<5; c++){
                a[r][c]=v;
                v +=2;
            }
        }*/

        System.out.println("삼각형 모양으로 배열 채우기");
        for(int r=0; r<5; r++){
            for(int c=0; c<5; c++)
                System.out.print(a[r][c]+"\t");
            System.out.println();
        }
    }
}
