
public class MyPriorityQueue<E extends Comparable<E>> {

    private MyHeap<E> heap = new MyHeap<E>();

    public void enqueue(E newObject) {
        heap.add(newObject);
        
    }

    public E dequeue() {
        return heap.remove();
    }

    public int getSize() {
        return heap.getSize();
    }

}