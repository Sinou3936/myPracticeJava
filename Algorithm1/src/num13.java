public class num13 {
    public static void main(String[] args) {
        int k=0, sw=0;
        double L=0, s=0;
        do{
            k++;
            L=(double)k/((k+1)*(k+2));
            if(sw==0){
                s+=L;
                sw=1;
            }else{
                s-=L;
                sw=0;
            }
        }while (k!=49);
        System.out.println("+-교행 분수 수열");
        System.out.println(String.format("%.3f",s));
    }
}
