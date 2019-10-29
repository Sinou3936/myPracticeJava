public class num6 {
    public static void main(String[] args) {
        int n=1, f=1, s=1;
        while (true){
            n++;
            f *=n;
            s +=f;
            if(n == 20)break;
        }
        System.out.println("누수 활용 수열");
        System.out.println(s);
    }
}
