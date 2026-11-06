package LinkedList.Circular;

public class DoublyLinkedList {

    class Node
    {
        int data;
        Node next;
        Node prev;

        public Node(int data)
        {
            this.data=data;
        }
    }

    Node head;

    public void insertBegin(int value)
    {
        Node newNode = new Node(value);
        if(head==null)
        {
            head=newNode;
            head.next=head;
            head.prev=head;
        }
        else
        {
            newNode.next=head;
            newNode.prev=head.prev;
            head.prev.next=newNode;
            head.prev=newNode;
            head=newNode;
        }
    }

    public void insertEnd(int value)
    {
        Node newNode = new Node(value);
        Node temp = head;
        do{
            temp=temp.next;
        }while(temp.next!=head);
        head.prev=newNode;
        temp.next=newNode;
        newNode.prev=temp;
        newNode.next=head;
    }

    public void displayList()
    {
        Node temp = head;
        do{
            System.out.print(temp.data+"-");
            temp=temp.next;
        }while(temp!=head);
    }

    public static void main(String[] args) {
        DoublyLinkedList dl = new DoublyLinkedList();
        dl.insertBegin(10);
        dl.insertBegin(20);
        dl.insertBegin(30);
        dl.insertEnd(40);
        dl.insertBegin(100);
        dl.insertEnd(90);
        dl.displayList();
    }
    
}
