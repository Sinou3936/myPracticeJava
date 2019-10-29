public class num5 {
    public static void main(String[] args) {
        int a[] = new int[20];
        int n=20;
        int T=0;
        do{
            if(n>=2){
                int p=2;
                for(;p<=n;p++){
                    if(n%p==0)
                        break;
                }
                T++;
                a[T]=p;
                n = n/p;
            }else
                return;
        }while (n!=1);
        System.out.println("소인수 분해");
        if(T==1){
            System.out.println("소수");
        }else {
            for(int j=1; j<T-1;j++){
                System.out.print(a[j]+"*");
            }
            System.out.println(a[T]);
        }
    }
}
