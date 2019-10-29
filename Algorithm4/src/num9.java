public class num9 {
    public static void main(String[] args) {
        int C[] ={4,2,10,7,12,15,18,20,9,13,1};
        int Cycle[] = {0,0,0,0,0,1,0};
        int N=7;
        int E=11;
        int temp;

        for(int i=0; i<11; i++)
            System.out.print(C[i]+"\t");
        System.out.println();

        for(int i=0; i<E-1; i++){
            for(int j=i+1; j<E; j++){
                if(C[i]>C[j]){
                 temp = C[i];
                 C[i]= C[j];
                 C[j]=temp;
                }
            }
        }
        for(int i=0; i<11; i++)
            System.out.print(C[i]+"\t");
        System.out.println();

        int L=1, K=0, T=0;
        while (L<=(N-1)){
            if(Cycle[K]==0){
                T=T+C[K];
                L++;
            }
            K++;
        }
        System.out.println();
        System.out.println("가중치의 총합: "+T);
    }
}
