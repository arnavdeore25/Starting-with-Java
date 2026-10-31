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
        list.displayList();
    }
}
