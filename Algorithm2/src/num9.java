public class num9 {
    public static void main(String[] args) {
        int a[] = {131,450,-100,150,50,-10,0,40,32,1};
        int Mincha = 533;
        int n=0;
        int Cha;
        int ans =n;
        do{
            if(a[n]>=33)
                Cha = a[n]-33;
            else
                Cha = 33-a[n];

            if(Cha<Mincha){
                Mincha = Cha;
                ans = n;
            }
            n++;
        }while (n<10);
        System.out.println("근사값알고리즘");
        System.out.println("근사값: "+(ans+1));
    }
}
