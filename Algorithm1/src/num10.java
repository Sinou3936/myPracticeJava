public class num10 {
    public static void main(String[] args) {
        int n=0, s=0;
        do{
            n++;
            s+=n;
            n++;
            s-=n;
        }while (n!=100);
        System.out.println("+- 교행 자연수 수열");
        System.out.println(s);
    }
}
