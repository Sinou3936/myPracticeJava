public class num13 {
    public static void main(String[] args) {
        int B[] = {0,1,1,1};
        int E[] = new int[4];
        int A[] = {0,0,1,1};

        int c=0;
        for(int k=3; k>=0; k--){
            int s = B[k]+A[k]+c;
            if(s>1){
                E[k] = s%2;
                c=1;

            }else{
                E[k] =s;
                c=0;
            }
        }
        System.out.println("BCD코드 와 3초과 코드의 변환");
        System.out.print("3초과 코드: ");
        for(int i=0; i<=3; i++)
            System.out.print(E[i]);
        System.out.println();
    }
}
