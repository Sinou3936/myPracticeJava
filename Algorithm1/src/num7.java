public class num7 {
    public static int fact(int n){
        int F;
        if(n>0) {
            F= fact(n-1)*n;
        }else
            return 1;
        return  F;
    }

    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}
