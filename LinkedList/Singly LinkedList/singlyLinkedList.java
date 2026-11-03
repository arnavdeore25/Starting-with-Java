package LinkedList;

class Node
{
    int data;
    Node next;
}

class LL
{
    Node head;
    void insertEnd(int data)
    {
        Node newNode = new Node();
        newNode.data = data;
        
        if(head== null)
        {
            head = newNode;
        }
        else
        {
            Node temp = head;
            while(temp.next!=null) {
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }

    void insertBegin(int data)
    {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = head;
        head = newNode;

    }

    void insertAtPosition(int data, int position)
    {
        Node newNode = new Node();
        newNode.data = data;
        int count = 1;
        Node temp = head;
        if(position == 1)
        {
            insertBegin(data);
        }
        else
        {
            while (count < position-1)
            {
                temp=temp.next;
                count++;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
        

    }

    void deleteNode(int position)
    {
        Node temp = head;
        int count = 1;
        while (count < position-1)
        {
            temp = temp.next;
            count++;
        }
        temp.next= temp.next.next;
        System.out.println("After deletion");
        displayList();
    }

    void displayList()
    {
        Node temp = head;
        while(temp.next!=null)
        {
            System.out.println(temp.data+" ");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }
}


class singlyLinkedList {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertEnd(10);
        list.insertEnd(20);
        list.insertEnd(30);
        list.insertBegin(90);
        list.insertAtPosition(15, 1);
        list.displayList();
        list.deleteNode(3);
    }
}
