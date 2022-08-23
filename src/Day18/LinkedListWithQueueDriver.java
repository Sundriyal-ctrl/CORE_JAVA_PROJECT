package Day18;

import java.util.LinkedList;

/**
 * write a program of linkedlist implementation of Queue .try all method
 *
 * @Author anuj sundriyal
 */
class LinkedListWithQueue
{
    void performingLinkedListMethod()
    {
        LinkedList linkedList = new LinkedList();
        linkedList.add(12);
        linkedList.add(90);
        System.out.println(linkedList);
        linkedList.addLast(32);
        System.out.println(linkedList);
        linkedList.removeFirst();
        System.out.println(linkedList);
    }
}
public class LinkedListWithQueueDriver {
    public static void main(String[] args) {
     new LinkedListWithQueue().performingLinkedListMethod();
    }
}
/*
OUTPUT

[12, 90]
[12, 90, 32]
[90, 32]
 */