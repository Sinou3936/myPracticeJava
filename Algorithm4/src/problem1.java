public class problem1 {
    public static void main(String[] args) {
        int a=1, b=1,s=a+b;
        int n=2;
        int c=0;
        while(true){
            c = a+b;
            s+=c;
            a=b;
            b=c;
            n++;
            if(n==10)break;
        }
        System.out.println(s);
    }
}
