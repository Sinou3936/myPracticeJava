public class num6 {
    public static void main(String[] args) {
        int a[] ={21,17,4,51,24,75,45,27,48,73};
        int cnt=0, i=0;

        do{
            int n3 = a[i]%3;
            int n4 = a[i]%4;
            int n = n3+n4;
            if(n==0)
                cnt++;
            i++;
        }while (i<10);
        System.out.println("배수와 공배수 알고리즘");
        System.out.println("공배수의 개수: "+cnt);
    }
}
