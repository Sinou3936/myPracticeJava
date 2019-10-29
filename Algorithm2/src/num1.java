public class num1 {
    public static void main(String[] args) {
        int JUMSU[] = {70,60,55,90,85,75,80,100,95,45};
        int cnt =0;
        int i=0;
       while (true){
           if(JUMSU[i]>=80)
               cnt++;
           i++;
           if(i>=10)break;
       }
        System.out.println("Count 알고리즘");
        System.out.println("80점 이상인 학생수: "+cnt);
    }
}
