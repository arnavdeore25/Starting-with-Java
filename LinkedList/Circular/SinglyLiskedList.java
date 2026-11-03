package LinkedList.Circular;

class Node
{
    int data;
    Node next;
    public Node (int data)
    {
        this.data = data;
    }
}  
public class SinglyLiskedList {
    static Node head = null;

    public static void insertBegin(int value)
    {
        Node temp = new Node(value);
        if(head == null)
        {
            head = temp;
            head.next = head;
        }
        else
        {
            Node dummy = head;
            while(dummy.next!=head)
            {
                dummy = dummy.next;
            }
            temp.next = head;
            dummy.next = temp;
            head = temp;
        }
    }
    public static void insertEnd(int value)
    {
        Node temp = new Node(value);
        Node dummy = head;
        do{
            dummy=dummy.next;
        }while(dummy.next!=head);
        dummy.next = temp;
        temp.next = head;
    }

    public static void insertAtPosition(int value, int position)
    {
        if(position == 1)
            insertBegin(value);

        Node temp = new Node(value);
        Node dummy  = head;
        int count =1;

        while(count < position - 1 && dummy.next != head)
        {
            dummy = dummy.next;
            count++;
        }

        temp.next = dummy.next;
        dummy.next = temp;
    } 

    public static void displayList()
    {
        Node dummy = head;
        do{
            System.out.println(" "+dummy.data);
            dummy=dummy.next;
        }
        while(dummy!=head);
    }
    public static void main(String[] args) {
        insertBegin(10);
        insertBegin(20);
        insertEnd(100);
        insertAtPosition(600, 2);
        displayList();
    }
}
