public class num3 {
    public static void main(String[] args) {
        int t[] = {184,240,9,235,333,295,20,38,329,34,
        350,59,313,24,187,327,234,59,324,47,
        145,95,282,148,213,182,283,227,156,217};
        int sum=0, i=0, n=0;
        while (true){
            if(t[i]>200){
                sum+=t[i];
                n++;
            }
            i++;
            if(i>=30)break;
        }
        int avg;
        avg = sum/n;
        System.out.println("합계 평균");
        System.out.println("한달 통화평균량은: "+avg);
    }
}
