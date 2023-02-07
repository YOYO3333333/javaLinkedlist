public class LinkedList<T> {

    /**
     * Initializes the list
     **/
    public Node<T> tete;

    public class Node<T> {
        public int Val;
        public Node N;

        public Node getN() {
            return N;
        }

        public void setN(Node n) {
            N = n;
        }

        public Node() {
            Val = 0;
            N = NULL;
        }

        public int getVal() {
            return Val;
        }

        public void setVal(int val) {
            Val = val;
        }


    }

    public LinkedList() {
        //TODO
        tete = null;

    }

    /**
     * Inserts the specified element into the list.
     * The elements must be sorted in ascending order.
     * null elements should be at the end of the list.
     *
     * @param e Element to be inserted
     **/
    public void insert(/*TODO*/) {
        //TODO




    }

    /**
     * Returns the n-th element in the list.
     *
     * @param i Index
     * @return The element at the given index
     * @throws IndexOutOfBoundsException if there is no element at this
     *                                   index.
     **/
    public T get(int i) {
        //TODO
    }

    /**
     * Removes the first occurrence of the specified element in the list.
     *
     * @param e Element to remove
     * @return returns the element that has been removed or null
     **/
    public T remove(/*TODO*/) {
        //TODO
    }

    /**
     * Returns the size of the list.
     *
     * @return Number of elements in the list
     **/
    public int size() {
        //TODO
    }

    /**
     * Removes all elements from the list.
     **/
    public void clear() {
        //TODO
    }
}
