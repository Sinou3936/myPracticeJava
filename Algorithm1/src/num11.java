public class num11 {
    public static void main(String[] args) {
        int n=0, s=0, sw=1;
        int nn=0;
        do{
            n++;
            nn =5*n;
            if(sw==1){
                s+=nn;
            }else{
                s-=nn;
            }
            sw = sw*-1;
        }while (nn!=100);
        System.out.println("이론 문제2");
        System.out.println(s);
    }
}
