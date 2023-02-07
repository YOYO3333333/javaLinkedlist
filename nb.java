public class LinkedList<T> {

    //Represent a
    //
    //
    // node of singly linked list
    public Node<T> tete = null;
    public Node<T> queue = null;
    class Node<T>{
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    //Represent the head and tail of the singly linked list


    //addNode() will add a new node to the list
    public void insert(T e)
    {   Node<T> n = new Node<T>(e);
        Node<T> tete2;

        /* Special case for head node */
        if (tete == null || tete.data >= n.data) {
            n.next = tete;
            tete = n;
        }
        else {

            /* Locate the node before point of insertion. */
            tete2 = tete;

            while (tete2.next != null
                    && tete2.next.data < tete2.data) {

                tete2 = tete2.next;
            }

            n.next = tete2.next;
            tete2.next = n;
        }
    }





    //countNodes() will count the nodes present in the list
    public int size() {
        int c = 0;
        //Node current will point to head
        Node deb = tete;

        while(deb != null) {
            //Increment the count by 1 for each node
            c++;
            deb= deb.next;
        }
        return c;
    }

    //display() will display all the nodes present in the list
    public void display() {
        //Node current will point to head
        Node current = tete;
        if(tete == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of singly linked list: ");
        while(current != null) {
            //Prints each node by incrementing pointer
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        LinkedList sList = new LinkedList();

        //Add nodes to the list
        sList.insert(1);
        sList.insert(2);
        sList.insert(9);
        sList.insert(4);

        //Displays the nodes present in the list
        sList.display();

        //Counts the nodes present in the given list
        System.out.println("Count of nodes present in the list: " + sList.size());
    }
}
