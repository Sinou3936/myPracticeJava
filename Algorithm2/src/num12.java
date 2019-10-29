public class num12 {
    public static void main(String[] args) {
        char H[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        char T[] = new char[20];
        int D= 1017;
        int i=0;
        int m,n;
        System.out.println("10진수와 16진수 변환");
        do{
             m = D/16;
             n = D-m*16;
            T[i] = H[n];
            i++;
            D=m;
        }while (m>=16);
        T[i]=H[m];
        int k=i;
        do{
            System.out.print(T[k]);
            k--;
        }while (k>=0);
    }
}
