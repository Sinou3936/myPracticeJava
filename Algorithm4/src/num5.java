public class num5 {
    public static void main(String[] args) {
        int E[] ={95,75,85,100,55};
        int i;
        int j, KEY;
        for(i=0; i<5; i++){
            KEY = E[i];
            for(j=i-1; j>=0; j--) {
                if (E[j] <= KEY) break;
                E[j + 1] = E[j];
            }
                E[j+1]=KEY;

        }

        System.out.println("삽입 정렬 알고리즘");
        for(int a=0; a<5; a++)
            System.out.print(E[a]+"\t");
        System.out.println();
    }
}
