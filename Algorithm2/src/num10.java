public class num10 {
    public static void main(String[] args) {
        int B[] = {0,1,0,1,0};
        int O[] = new int[5];
        int T[] = new int[5];

        int i=0;
        do{
            O[i] = 1-B[i];
            i++;
        }while (i<5);
        i=4;
        int c=1;
        do{
            T[i]=1;
            if(O[i]==c){
                T[i]=0;
            }
            c=O[i]*c;
            i--;
        }while (i>=0);

        System.out.println("1의 보수와 2의보수 알고리즘");
        System.out.print("1의보수: ");
        for(int N=0; N<5; N++)
            System.out.print(O[N]);
        System.out.println();

        System.out.print("2의보수: ");
        for(int N=0; N<5; N++)
            System.out.print(T[N]);
        System.out.println();
    }
}
