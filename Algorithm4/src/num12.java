import java.util.Scanner;

public class num12 {
    public static int SS(int E[], int L, int H, int K){
        int i;
        for(i =L; i<H; i++){
           if(E[i] == K)
               return i;
        }
        return  -99;
    }

    public static void main(String[] args) {
        int E[] = {3,4,2,5,9,22,43,25,96,54,20,31,12,23};
        Scanner scan = new Scanner(System.in);
        System.out.println("입력 하는 값의 숫자");
        int K;
        K = scan.nextInt();
        System.out.println("순차 정렬을 이용한 배열");
        System.out.println(SS(E,0,13,K));
    }
}
