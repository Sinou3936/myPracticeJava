public class num15 {
    public static void main(String[] args) {
        int k=0, sw=0;
        double s=0, L=0;
        do{
            k++;
            L =(double)k/((k+1)*(k+2));
            if(sw==0){
                s+=L;
                sw=1;
            }else{
                s-=L;
                sw=0;
            }
        }while (k>49);
            System.out.println("예상알고리즘");
            System.out.println(String.format("%.3f",s));

    }
}
