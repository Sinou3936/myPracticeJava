public class num15 {
    public static void main(String[] args) {
        int P[] ={0,1,0,0,1,0,0,0,1};
        int Pn=0;
        for(int k=0; k<=8; k++){
            if(P[k]==1)
                Pn++;
        }
        int E = Pn%2;
        System.out.println("패리티 비트 검증 알고리즘");
        if(P[0]==E){
            System.out.println("오류 미발견");
        }else{
            System.out.println("오류 발견");
        }
    }
}
