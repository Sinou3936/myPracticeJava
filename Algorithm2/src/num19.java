public class num19 {
    public static void main(String[] args) {
        int X[] ={1,0,1,0,1};
        int Y[] = new int[4];

        Y[1]=X[2];
        if(X[1]==0){
            for(int k=1; k<=3; k++){
                Y[k] = 1;
                if(X[k]==X[k+1])
                    Y[k]=0;
            }
        }else{
            for(int k=1;k<=3;k++){
                Y[k]=1;
                if(Y[k-1]==X[k+1])
                    Y[k]=0;
            }
        }
        System.out.println("예상 알고리즘 4번");
        for(int k=0; k<=3; k++)
            System.out.print(Y[k]);
        System.out.println();
    }
}
