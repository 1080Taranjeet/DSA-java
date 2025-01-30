package lactuer5;

public class Linklist {

    static class node {
        int data;
        node next;

        void insertHead(int data) {
            node curr = new node();
            curr.data = data;
            curr.next = this.next;
            this.next = curr;
        }

        void display() {
            node head = new node();
            head = this.next;
            if (head == null)
                System.out.println("the list is empty ");
            while (head != null) {
                System.out.println(head.data);
                head = head.next;
            }
        }

        void delete() {
            if (this.next != null) {
                System.out.println("delete the element from head " + this.next.data);
                this.data = this.next.data;
                this.next = this.next.next;
            } else {
                System.out.println("the list is empty ");
            }
        }

    }

    public static void main(String[] args) {

        node mylist = new node();

        mylist.insertHead(1);
        mylist.insertHead(2);
        mylist.insertHead(3);
        mylist.insertHead(4);

        mylist.display();

        mylist.delete();

        mylist.display();

    }
}
