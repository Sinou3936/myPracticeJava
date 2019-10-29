public class num18 {
    public static void main(String[] args) {
        int c;
        for(c=0; c<24; c++){
            int nc = c*4;
            for(int a=0; a<48; a++){
                int na = a*2;
                int T = na+nc;
                if(T!=100)break;
            }
        }
        System.out.println("예상 문제 알고리즘 3번");
        System.out.println(c);
    }
}
