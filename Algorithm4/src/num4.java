public class num4 {
    public static void main(String[] args) {
        int n=25;
        int temp;
        int a[] = new int[n];

        for(int i=0;i<n-1;i++){
            for(int j=0; j<n-i; j++) {
                if (a[j] > a[j + 1])
                {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        int sum=0;
        for(int i=1; i<n-1; i++){
            sum = sum+a[i];
        }
        int avg = sum/(n-2);
        double s =0;
        for(int i=0; i<n-1; n++){
            temp = a[i]-avg;
            s = s+(temp*temp);
        }
        s = Math.sqrt(s/(n-2));
        System.out.print(s);
    }
}
