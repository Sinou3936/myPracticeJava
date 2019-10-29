public class num12 {
    public static void main(String[] args) {
        int n=0, s=0, nn=0;
        do{
            n++;
            nn=5*n;
            if(n%2==1){
                s+=nn;
            }else{
                s-=nn;
            }
        }while (nn !=100);
        System.out.println("sw사용하지 않는 알고리즘");
        System.out.println(s);
    }
}
