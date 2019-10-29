public class num3 {
    public static void main(String[] args) {
        int E[] = {95,75,85,45,20};
        int i=0;
        int temp;

        do{
            int j=0;
            do{
                if(E[j]>E[j+1]){
                    temp = E[j];
                    E[j]= E[j+1];
                    E[j+1] = temp;
                }
                j++;
            }while (j<(4-i));
            i++;
        }while (i<4);

        System.out.println("버블정렬 알고리즘");
        for(int a=0; a<5; a++)
            System.out.print(E[a]+"\t");
        System.out.println();
    }
}
