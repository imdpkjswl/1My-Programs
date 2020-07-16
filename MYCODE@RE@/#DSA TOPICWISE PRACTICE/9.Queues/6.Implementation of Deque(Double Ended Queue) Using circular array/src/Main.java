class Main {

    static int size =5;
    static int[] arr = new int[size];
    static int front =0;
    static int rear =0;
    static int Count =0;


    // Checks whether Deque is full or not.
    static boolean isFull() {

        return front == rear && !isEmpty();
    }

    // Checks whether Deque is empty or not.
    static boolean isEmpty() {
        return front == rear && Count == 0;
    }

    // Inserts an element at front
    static void insertFront(int key) {
        if (isFull())
            return;

        Count++;
        arr[front] = key;
        front = front + 1;
        front %= size;
    }

    // function to inset element at rear end
    // of Deque.
    static void insertRear(int key) {
        if (isFull())
            return;
        Count++;
        rear = (rear - 1) % size;
        arr[rear + size] = key;

    }

    // Deletes element at front end of Deque
    static void deleteFront() {
        if (isEmpty())
            return;
        Count--;
        front = (front - 1) % size;
    }

    // Delete element at rear end of Deque
    static void deleteRear() {
        if (isEmpty())
            return;
        Count--;
        rear = (rear + 1) % size;
    }

    // Returns front element of Deque
    static int getFront() {
        int getFront = front-1;

        if (getFront < 0)
            getFront += size;
        return arr[getFront % size];
    }

    // function return rear element of Deque
    static int getRear() {
        int getRearIndex = rear + size;
        return arr[getRearIndex % size];
    }


    // Driver program to test above function
    public static void main(String[] args) {


        System.out.println("Insert element at rear end : 5 ");
        insertRear(5);

        System.out.println("insert element at rear end : 10 ");
        insertRear(10);

        System.out.println("get rear element : " + getRear());

        deleteRear();
        System.out.println("After delete rear element new rear become : " + getRear());

        System.out.println("inserting element at front end");
        insertFront(15);

        System.out.println("get front element: " + getFront());

        deleteFront();

        System.out.println("After delete front element new front become : " + getFront());

    }
}