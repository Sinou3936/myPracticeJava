public class num1 {
    public static void main(String[] args) {
        int sum=0;
        int n=1;
        while(true){
            sum += n;
            n++;
            if(n>100)break;
        }
        System.out.println("기본 수열");
        System.out.println(sum);
    }
}
