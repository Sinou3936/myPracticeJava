public class num2 {
    public static void main(String[] args) {
        int s1=0, s2=0;
        int n1=7, n2=20;
        for(int i=n1; i<n2; i++){
            s1 += i;
            if(i%3==0)
                s2 +=i*i;
        }
        System.out.println("이론 확인 문제");
        System.out.println("S1:" + s1);
        System.out.println("S2:" + s2);
    }
}
