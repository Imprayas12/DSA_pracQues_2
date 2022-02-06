import java.util.Scanner;

class Node_revList{
    int data;
    Node_revList next;
    public Node_revList(int data){
        this.data = data;
    }
}


public class Q5 {
    Node_revList head;
    public void add(int data){
        Node_revList d = new Node_revList(data);
        if(head == null) {
            head = d;
        }
        else{
            Node_revList temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = d;
        }
    }
    public void display(){
        Node_revList temp = head;
        while(temp!=null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
    public void revDisplay(Node_revList node_revList){
        if(node_revList == null){
            return;
        }
        revDisplay(node_revList.next);
        System.out.print(node_revList.data +" ");
    }
    public void rev_List_No_recursion(Node_revList node_revList){
        Node_revList temp = node_revList;
        Node_revList last = null;
        while (last != node_revList){
            while (temp.next != last){
                temp = temp.next;
            }
            last = temp;
            System.out.print(last.data +  " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            Q5 List = new Q5();
            int n = sc.nextInt();
            while (n!=-1){
                List.add(n);
                n = sc.nextInt();
            }
        }
    }
}
