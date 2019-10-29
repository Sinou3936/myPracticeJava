public class num4 {
    public static void main(String[] args) {
        int a[][] = new int[5][5];
        int n=0, s=1,i=0,j=-1,k=5;

        while (true){
            for(int P=0; P<k; P++){
                n++;
                j+=s;
                a[i][j]=n;
            }
            k--;
            if(k<=0)break;
            for(int P=0; P<k; P++){
                n++;
                i+=s;
                a[i][j]=n;
            }
            s*=-1;
        }

        for(int r=0; r<5; r++){
            for(int c=0; c<5; c++)
                System.out.print(a[r][c]+"\t");
            System.out.println();
        }
    }
}
