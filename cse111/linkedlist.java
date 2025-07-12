import java.util.*;

class Node{
    int value ;
    Node next ;
    public Node(int v){
        this.value = v ;
        this.next = null;
    }
}
public class linkedlist {

    public Node ConvertToLL(int[] arr){
        Node head = null;
        Node tail = null ;
        for (int i = 0 ; i < arr.length ; i++){
            if(i==0){
                head = new Node(arr[0]);
                tail = head;
            }else{
                Node obj = new Node(arr[i]);
                tail.next = obj ;
                tail = obj ;
            }
        }
        return head ;
    }
    public void print(Node head){
        Node current = head;
        while(current != null){
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();

    }
    public void nTravel(Node head, int n){
        Node current = head;
        int c = 0;
        while(c <= n){
            System.out.print(current.value + " ");
            current = current.next;
            c++;
        }
        System.out.println();

    }
    public void rnTravel(Node head, int n){
        Node current = head;
        int i = 0;
        while(i <= n){
            if(i==n) {
                System.out.print(current.value + " ");
            }
            current = current.next;
            i++;
        }

    }
    public int count(Node head){
        Node current = head;
        int c = 1;
        while(current.next != null){
            c++;
            current = current.next;

        }
        return c ;

    }
    public void reverse(Node head){
        Node current = head ;
        int length = this.count(head)-1;
        for (int i = length; i >= 0 ; i--){
            this.rnTravel(current,i);
        }
        System.out.println();
    }
    public void reversedir(Node head){
        Node current = head ;
        Node temp = null ;
        Node dummyHead = null ;
        while(current != null ){
            temp = current.next;
            current.next = dummyHead;
            dummyHead = current;
            current = temp;
        }
        this.print(dummyHead);
    }
    public Node insertLast(Node head, int value){
        Node newNode = new Node(value);
        if(head == null){
            return newNode;
        }
        Node current = head;
        while (current.next!=null){
            current = current.next;
        }
        current.next = newNode;
        return head;
    }
    public Node insert(Node head, int index, int value){
        Node newNode = new Node(value);
        //first of the LL
        if(index == 0){
            newNode.next = head;
            return newNode;
        }
        //index more than LL length
        int length = this.count(head);
        if(index > length){
            System.out.println("Index out of bounds.");
            return head;
        }
        //normal case
        Node current = head;
        int i = 0;
        while(current != null && i <index-1){
            current = current.next ;
            i++;
        }
        newNode.next = current.next;
        current.next = newNode ;
        return head;
    }
    public Node delete(Node head, int index){
        if(head == null){
            return null;
        }
        if(index == 0){
            return head.next;
        }
        Node current = head;
        int i = 0;
        while(current != null && i < index - 1){
            current = current.next;
            i++;
        }
        if(current == null || current.next == null){
            System.out.println("Index out of bounds.");
            return head;
        }
        current.next = current.next.next;
        return head;
    }
    public Node getNode(Node head, int index){
        Node current = head;
        int i = 0;
        while(current != null){
            if(i == index){
                return current;
            }
            current = current.next;
            i++;
        }
        return null;
    }
    public int getValue(Node head, int index){
        Node node = getNode(head, index);

        if(node != null){
            return node.value;
        }
        System.out.println("Index out of bounds.");
        return 0;
    }


    public static void main(String[]args){
        Node head;
        linkedlist obj = new linkedlist();
        int[] arr = {23,24,25,1,2,3,4};
        head = obj.ConvertToLL(arr);

        System.out.println("Print total LL - ");
        obj.print(head);

        System.out.println("Print upto nth - ");
        obj.nTravel(head, 2);

        System.out.println("No of elements in LL - ");
        System.out.println(obj.count(head));

        System.out.println("Insert at last - ");
        obj.print((obj.insertLast(head, 90)));

        System.out.println("Insert at a index - ");
        obj.insert(head, 4, 9);
        obj.print(head);

        System.out.println("delete at an index - ");
        head = obj.delete(head, 3);
        obj.print(head);

        Node n = obj.getNode(head, 2);
        System.out.println("Node at index 1: " + n );

        int val = obj.getValue(head, 4);
        System.out.println("Value at index 4: " + val);

        System.out.println("Latest LL - ");
        obj.print(head);

        System.out.println("print in reverse order - ");
        obj.reverse(head);

        System.out.println("reverse print by changing direction - ");
        obj.reversedir(head);




    }
}
