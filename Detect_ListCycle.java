/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as:
    class Node {
        int data;
        Node next;
    }
*/

boolean hasCycle(Node head)
{
   Node first = head;
   Node second = head;
   while(first!= null){
     first = first.next.next;
     second = second.next;
     if(first == second){
       return true;
     }
   }
    return false;
}

