import java.util.Scanner;

class Node {
    int data;
    Node next;
    public Node(int data){
        this.data = data;
    }
}

public class LengthLL {
    Node head;
    public void add(int data){
        Node newNode = new Node(data);
        if(head == null) head = newNode;
        else{
            Node temp = head;
            while(temp.next !=null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    public void size(){
        int c=0;
        Node temp = head;
        while (temp!=null){
            temp = temp.next;
            c++;
        }
        System.out.println("Size of current linked list is " + c);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            LengthLL list1 = new LengthLL();
            int n = sc.nextInt();
            while (n!=-1){
                list1.add(n);
                n = sc.nextInt();
            }
            list1.size();
        }
    }
}
