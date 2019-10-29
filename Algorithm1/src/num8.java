import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num8 {
    static int F[] = new int[1000];

    public static int Fib(int n){
        if(F[n]==0){
            if(n ==1 || n==2){
                F[n] = 1;
            }
            else{
                F[n]=Fib(n-1)+Fib(n-2);
            }
        }
        return F[n];
    }
    public static void main(String[] args) throws IOException {
        System.out.println("누수승 동적 알고리즘 ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        br.close();

        if(number>1000)
            System.out.println("OverFlow");

        System.out.println(Fib(number));
    }
}
