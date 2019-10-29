public class num14 {
    public static void main(String[] args) {
       int s1=0, s2=0;
       int n1= 20, n2=25;
       int a,b;
       if(n1<n2){
           a=n1;
           b=n2;
       }else{
           a=n2;
           b=n1;
       }
       for(int i=a; i<b; i++){
           s1+=i;
           if(i%2==1)
               s2+=i*i;
       }
       System.out.println("예상알고리즘1");
       System.out.println("S1의 값: "+s1);
       System.out.println("S2의 값: "+s2);
    }
}
