public class num8 {
    public static void main(String[] args) {
        int x=60, y=124;
        if(x<y){
            int temp = x;
            x=y;
            y= temp;
        }
        for(;;) {
            int m = x % y;
            if(m==0){
                break;
            }else{
                x=y;
                y=m;
            }
        }
        System.out.println("최대공약수,최소공배수 알고리즘");
        System.out.println("최대공약수의 값:"+y);
    }
}
