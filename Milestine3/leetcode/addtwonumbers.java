package Milestine3.leetcode;
class Node{
    int val;
    Node next;
    Node(int data){
        val=data;
    }
}

public class addtwonumbers {
    static addElements(int data, Node head) {
        Node n=new Node(5);
        if(head==null){
            n.val=data;
            n.next=null;
            head=n;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=n;
            n.val=data;
        }

    }
    static void deleteElements(Node head,int pos){
        if(head==null)
            return;
        if(pos==0){
            head=head.next;
            return;
        }
        Node temp=head;
        for(int i=0;i<pos-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;



    }
    static void reverse(Node head){
        if(head==null)
        return;
        Node p
    }
    
}
