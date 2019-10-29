public class num3 {
    public static void main(String[] args) {
        int a=2, d=6, s=a, n=2, an=0;
        while(true){
            an =a+(n-1)*d;
            s += an;
            n++;
            if(n>200)break;
        }
        System.out.println("등차수열");
        System.out.println(s);
    }
}
