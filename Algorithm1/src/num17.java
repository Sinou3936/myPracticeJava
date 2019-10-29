import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num17 {
    static int F[] = new int[1000];

    public static int Fib(int n){
        if(F[n]==0){
            if(n==1 || n==2){
                F[n] = 1;
            }
            else{
                F[n] = Fib(n-1)+Fib(n-2);
            }
        }
        return  F[n];
    }

    public static void main(String[] args) throws IOException {
        System.out.println("예상 알고리즘 4");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(br.readLine());
        br.close();

        if(i>1000)
            System.out.println("OverFlow");
        System.out.println(Fib(i));
    }
}
