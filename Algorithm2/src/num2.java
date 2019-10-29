public class num2 {
    public static void main(String[] args) {
        int m=0, i=0;
        int eng[] = {70,65,55,90,85,75,80,100,95,45};
        int math[] = {90,45,60,77,85,65,80,95,80,55};
        while (true){
            if(eng[i]>=80){
                if(math[i]>m)
                    m=math[i];
            }
            i++;
            if(i>=10)break;
        }
        System.out.println("최대값 최소값 알고리즘");
        System.out.println(m);
    }
}
