import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num17 {
    public static void main(String[] args) throws IOException {
        int M[] = new int[5];
        int Name[] = new int[5];
        int i=0;
        while (true){
            M[i]=0;
            i++;
            if(i>=5)break;
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int s = Integer.parseInt(br.readLine());
        int p = Integer.parseInt(br.readLine());
        br.close();
        while (true){
            M[s]=M[s]+p;
            if(s==0)break;
        }
            int j=0;
            for(i=2; i<5; i++){
                if(M[i]>M[j])
                    j=i;
            }
            System.out.print(Name[j]+","+M[j]);
    }
}