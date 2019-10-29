public class num5 {
    public static void main(String[] args) {
        int a=1,b=1, s=a+b, n=2;
        int c=0;
        while(true){
            c=a+b;
            s +=c;
            a=b;
            b=c;
            n++;
            if(n==100)break;
        }
        System.out.println("피보나치 수열");
        System.out.println(s);
    }
}
