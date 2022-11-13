package list;


public class Node {
    private Object data;
    private Node next;
    public Node(Object datavalue) {
        next = null;
        data=datavalue;
    }
    public Node(Object datavalue,Node nextvalue) {
        next = nextvalue;
        data=datavalue;
    }

    public Object getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setData(Object a) {
        this.data = a;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
