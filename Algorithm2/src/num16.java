public class num16 {
    public static void main(String[] args) {
        int E[] = {60,95,48,88,79,40,68,75,85,76};
        int i=0, cnt=0;
        while (true){
            if(E[i]>=70){
                if(E[i]<90)
                    cnt++;
            }
            i++;
            if(i>=10)break;
        }
        System.out.println("예상 알고리즘 1번");
        System.out.println("영어 점수 70점이상 90점 미만 학생수: "+cnt);
    }
}
