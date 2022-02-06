import java.util.Scanner;

class Node_6{
    int data;
    Node_6 next;
    public Node_6(int data){
        this.data = data;
    }
}

public class print_ith_Node {
    Node_6 head;
    public void add(int data){
        Node_6 newNode = new Node_6(data);
        if(head == null) {
            head = newNode;
        }
        else{
            Node_6 temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    public void print(int pos){
        Node_6 temp = head;
        while(pos>0){
         pos--;
         temp = temp.next;
        }
        System.out.println(temp.data);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            print_ith_Node List = new print_ith_Node();
            int n = sc.nextInt();
            while (n!=-1){
                List.add(n);
                n = sc.nextInt();
            }
            List.print(sc.nextInt());
        }
    }
}
