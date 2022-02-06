import java.util.Scanner;


class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
    }
}

public class Q3 {
    Node head;
    public void add(int data){
        Node d = new Node(data);
        if(head == null) {
         head = d;
        }
        else{
            Node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = d;
        }
    }
    public void display(){
     Node temp = head;
     while(temp!=null) {
         System.out.print(temp.data + "->");
         temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
    public void removeDuplicates(){
        if(head.data == head.next.data){
            head = head.next;
        }
        Node temp = head;
        while (temp.next!=null){
            if(temp.next.data == temp.next.next.data){
                temp.next = temp.next.next;
            }
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
     /* Elements should be inputted only in ascending order. */
        Scanner sc = new Scanner(System.in);
        Q3 list1 = new Q3();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list1.add(sc.nextInt());
        }
        list1.display();
        list1.removeDuplicates();
        list1.display();
    }
}
