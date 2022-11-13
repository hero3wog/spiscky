package list;

public class Main {
    public static void main(String[] args) {
        Object max;
        int w = 0;
        Node c = new Node(20);
        Node b = new Node(33, c);
        Node a = new Node(10, b);
        MyLinkedList list = new MyLinkedList();
        list.add(6);
        list.add(1);
        list.add(7);
        list.add(112);
        list.add(19);
        list.add(2);
        list.add(789);
        list.addstart(3);



        System.out.println(list.toString());
        for (int k=1;k<list.size()+1;k++){
            max = list.get(k);

            for (int i = k; i < list.size()+1; i++) {

                int x = (int) list.get(i);

                int z = (int) max;

                if (x > z) {
                    max = x;
                    w = i;

                }
            }
        if (w != 0) {
            list.remove(w);
            list.addstart(max);
            w=0;
        }else
        {
            list.remove(k);
            list.addstart(max);
            w=0;
        }


        System.out.println(list.toString());
    }
}
}