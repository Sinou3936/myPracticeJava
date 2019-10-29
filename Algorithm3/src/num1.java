public class num1 {
    public static void main(String[] args) {
        int a[][] =new int[5][5];
        int v=1;

        for(int c=0; c<5; c++){
            for(int r=0; r<5; r++){
                a[r][c]=v;
                v++;
            }
        }
        System.out.println("행/열 우선 배열 채우기");
        for(int r=0; r<5; r++){
            for(int c=0; c<5; c++)
                System.out.print(a[r][c]+"\t");
            System.out.println();
        }
        System.out.println();
        for(int r=0; r<5; r++){
            for(int c=0; c<5; c++)
                System.out.print(a[c][r]+"\t");
            System.out.println();
        }
    }
}
