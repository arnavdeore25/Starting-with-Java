/* 
Create a small text editor using StringBuffer.

Perform these operations:
1. Insert " World" after "Hello"
2. Replace "Java" with "Programming"
3. Delete "World " from the sentence
4. Reverse the final string
Display the result after every operation.
*/

public class textEditor {
    public static void main(String[] args) 
{
        StringBuffer text = new StringBuffer("Hello Java");
        System.out.println("Original: "+ text);
        text.insert(5," World");
        System.out.println("After insert: "+text);
        text.replace(11,15,"Programming");
        System.out.println("After replace: "+text);
        text.delete(5, 11);
        System.out.println("After delete: " +text);
        text.reverse();
        System.out.println("After reverse: "+text);
    }
}