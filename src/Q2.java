

public class Q2 {
    public boolean find(int[] arr,int i,int f){
        if(arr[i]==f) return true;
        return i != arr.length - 1 && find(arr, i + 1,f);
    }
    public static void main(String[] args) {
        System.out.println(new Q2().find(new int[]{1,2,3,4,5},0,6));
    }
}
