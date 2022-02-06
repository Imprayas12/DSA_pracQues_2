import java.util.Scanner;

class Node_MidPoint{
    int data;
    Node_MidPoint next;
    public Node_MidPoint(int data){
        this.data = data;
    }
}

public class Q4 {
    Node_MidPoint head;
    public void add(int data){
        Node_MidPoint d = new Node_MidPoint(data);
        if(head == null) {
            head = d;
        }
        else{
            Node_MidPoint temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = d;
        }
    }
    public void display(){
        Node_MidPoint temp = head;
        while(temp!=null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
    public Node_MidPoint midPoint(){
        Node_MidPoint slow = head;
        Node_MidPoint fast = head.next;
        while (fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            Q4 List = new Q4();
            int n = sc.nextInt();
            while (n!=-1){
                List.add(n);
                n = sc.nextInt();
            }
            System.out.println(List.midPoint().data);
        }
    }
}
