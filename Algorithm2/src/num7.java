public class num7 {
    public static void main(String[] args) {
        System.out.println("약수와 완전수 알고리즘");
        int tn=0;
        for(int n=4; n<500; n++){
            int sum=0;
            int k = n/2;
            for(int j=1; j<k; j++){
                int R = n%j;
                if(R==0)
                    sum+=j;
            }
            if(n==sum){
                System.out.println("N의 값: "+n);
                tn +=1;
            }
        }
        System.out.println("TN의 값: "+tn);
    }
}
