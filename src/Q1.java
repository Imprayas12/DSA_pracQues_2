
public class Q1 {
    public int findBin(int a,int c){
        if(a!=0) {
             c *= 10;
             c += a % 2;
             a /= 2;
         }
         return a==0 ? c : findBin(a,c);
    }

    public static void main(String[] args) {
        System.out.println(new Q1().findBin(9,0));
    }
}
