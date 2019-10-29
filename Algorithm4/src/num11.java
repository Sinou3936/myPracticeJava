public class num11 {
    public static void main(String[] args) {
        int a[] = {2,1,5,8,4,9};
        int b[] = {20,3,7,6,10};
        int M=6;
        int L=5;
        int c[] = new int[10];
        int i=0, j=L-1, k=0;
        System.out.println("예상문제 4번 (병합정렬을 이용한 배열)");

        for(;;){
            if(a[i]<b[j]){
                c[k] = a[i];
                i++;
                k++;
                if(i>L-1){
                    for(int p=j; p<M-1; p++){
                        c[k]=b[p];
                        k++;
                    }
                }else
                    break;
            }else{
                c[k]=b[j];
                j++;
                k++;
                if(j>M){
                    for(int p=i; p<L; p++){
                      c[k] =a[p];
                      k++;
                    }
                }else
                    break;
            }
        }
        for(int n=0; n<M+L; n++)
            System.out.print(c[k]+"\t");
        System.out.println();
    }
}
