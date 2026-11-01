package LinkedList;

public class doublyLinkedList {
    
    Node head;

    private class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data)
        {
            this.data = data;
        }
    }

    public void insertEnd(int value)
    {
        Node newNode = new Node(value);
        if(head == null)
            head = newNode;
        else
        {
            Node temp = head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newNode;
            newNode.prev = temp;
            temp = newNode;
        }   
    }

    public void insertBegin(int value)
    {
        Node newNode = new Node(value);
        newNode.next=head;
        if(head!=null)
            head.prev=newNode;
        
        head=newNode;
    }

    public void displayList()
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        doublyLinkedList list = new doublyLinkedList();
        list.insertEnd(10);
        list.insertEnd(20);
        list.insertBegin(100);
        list.displayList();
    }


}
