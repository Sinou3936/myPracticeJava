import java.util.Scanner;

public class num1 {
    public static void main(String[] args) {
        int a[] = new int[25];
        int r[] = new int[25];

        Scanner StdIDInput = new Scanner(System.in);
        for(int i=0; i<25; i++){
            a[i] = StdIDInput.nextInt();
            r[i]=i;
        }
        for(int i=0; i<25; i++){
            for(int j=0; j<25; j++){
                if(a[i]<a[j])
                    r[i]=r[i]+1;
            }
        }
        System.out.println("석차 구하기 알고리즘");
        for(int n=0; n<25; n++)
            System.out.println(a[n]+" : "+r[n]);
    }
}
