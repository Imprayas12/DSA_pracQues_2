import java.util.Scanner;
import java.util.Stack;

class Node_Pal{
    int data;
    Node_Pal next;
    public Node_Pal(int data){
        this.data = data;
    }
}

public class Palindrome_Linked_List {
    Node_Pal head;
    public void add(int data){
        Node_Pal newNode = new Node_Pal(data);
        if(head == null) {
            head = newNode;
        }
        else{
            Node_Pal temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    public boolean checkPal(){
        Stack<Integer> st = new Stack<>();
        Node_Pal temp = head.next;
        st.push(head.data);
        while (temp!=null){
            if(st.peek()!= temp.data){
                st.push(temp.data);
            }
            else {
                st.pop();
            }
            temp = temp.next;
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            Palindrome_Linked_List List = new Palindrome_Linked_List();
            int n = sc.nextInt();
            while (n!=-1){
                List.add(n);
                n = sc.nextInt();
            }
            System.out.println(List.checkPal());
        }
    }
}
