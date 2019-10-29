public class num2 {
    public static void main(String[] args) {
        int E[] = {95,75,85,65,30};
        int i=0;
        int temp;

        do{
            int j=i+1;
            do{
                if(E[i]>E[j]){
                    temp = E[i];
                    E[i]=E[j];
                    E[j]=temp;
                }
                j++;
            }while (j<5);
            i++;
        }while (i<4);

        System.out.println("선택 정렬 알고리즘");
        for(int a=0;a<5;a++)
            System.out.print(E[a]+"\t");
        System.out.println();
    }
}
