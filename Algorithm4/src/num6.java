public class num6 {
    public static void main(String[] args) {
        int a[] = {2,5,10,17,20};
        int b[] = {11,9,8,7};
        int c[] = new int[9];
        int m=5, n=4;
        int iA=0, iB=n-1, iC=0;
        int done =0;
        for(;;){
            if(a[iA]<b[iB]) {
                c[iC] = a[iA];
                iA++;
                iC++;
                if (iA > m-1) {
                    if (done == 0) {
                        a[m] = 99999;
                        iA = m - 1;
                        done = 1;
                    } else
                        break;
                }
            }
            else{
                c[iC] = b[iB];
                iB--;
                iC++;
                if(iB<0){
                    if(done==0){
                        b[0]=99999;
                        iB=0;
                        done=1;
                    }
                    else
                        break;
                }
            }
        }
        System.out.println("병합 정렬");
        for(int i=0; i<m+n; i++)
            System.out.print(c[i]+"\t");
        System.out.println();
    }
}
