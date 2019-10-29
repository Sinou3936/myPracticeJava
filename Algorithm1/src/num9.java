public class num9 {
    public static void main(String[] args) {
        int s=0, a=0, b=0, c=0;
        do{
            a++;
            b= 101-a;
            c = a*b;
            c *=c;
            s +=c;
        }while (a<100);
        System.out.println("제곱의 합");
        System.out.println(s);
    }
}
