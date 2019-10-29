public class num16 {
    public static void main(String[] args) {
        int k=0, sw=0;
        int m=0, n=1;
        double L, s=0;

        do{
            k++;
            m +=k;
            n *=k;
            L=(double)(m/n);
            if(sw==0){
                s+=L;
                sw=1;
            }else{
                s-=L;
                sw=0;
            }
        }while (k>20);
        System.out.println("예상알고리즘3");
        System.out.println(s);
    }
}
