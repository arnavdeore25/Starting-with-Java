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
    public void insertAtPosition(int value, int position)
    {
        Node newNode = new Node(value);
        if(position ==1)
        {
            insertBegin(value);   
        }
        else
        {
            Node temp = head;
            for(int i=1; i<position-1; i++)
            {
                temp = temp.next;
            }
            newNode.next=temp.next.next;
            newNode.prev = temp;
            temp.next=newNode;
        }

    }

    public void deletion(int position)
    {
        Node temp = head;
        int count=1;
        while (count < position-1) 
        {
            temp=temp.next;
            count++;    
        }
        Node target = temp.next;
        Node nextNode = target.next;
        temp.next = nextNode;
        nextNode.prev = temp;
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
        list.insertBegin(200);
        list.insertBegin(230);
        list.insertAtPosition(400, 3);
        list.insertAtPosition(19, 1);
        list.deletion(3);
        list.displayList();
    }


}
