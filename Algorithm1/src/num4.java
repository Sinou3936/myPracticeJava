public class num4 {
    public static void main(String[] args) {
        int r=3, a=2, s=a, n=2;
        while (true){
            a *=r;
            s +=a;
            n++;
            if(n>10)break;
        }
        System.out.println("등비수열");
        System.out.println(s);
    }
}
