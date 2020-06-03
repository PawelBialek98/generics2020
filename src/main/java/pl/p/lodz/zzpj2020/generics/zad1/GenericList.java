package pl.p.lodz.zzpj2020.generics.zad1;

public class GenericList<T> {
    private Node<T> head = new Node<>(null,null);
    private int size = 0;

    public void add(T t){
        if(head.getValue() == null){
            head.setValue(t);
        } else {
            Node<T> last = head;
            while (last.getNext() != null) {
                last = last.getNext(); //szukamy ostatniego elementu
            }
            last.setNext(new Node<>(t));
        }
        size++;
    }

    public Node<T> get(int index) throws IndexOutOfBoundsException {
        if(index<0 || index>size) throw new IndexOutOfBoundsException();
        Node<T> get = head;
        for(int i=0; i<index; i++){
            get = get.getNext();
        }
        return get;
    }

    public void clear(){
        head = new Node<>(null,null);
        size = 0;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int getSize(){
        return size;
    }

    public T getElement(int indexToDisplay) {
        return this.get(indexToDisplay).getValue();
    }

    private static final class Node<T>{
        private T value;
        private Node<T> next;

        public Node(T val){
            this(val, null);
        }

        public Node(T val, Node<T> n){
            value = val;
            next = n;
        }

        public Node<T> getNext(){
            return next;
        }

        public void setNext(Node<T> n){
            next = n;
        }

        public T getValue(){
            return value;
        }

        public void setValue(T o){
            value = o;
        }
    }
}
