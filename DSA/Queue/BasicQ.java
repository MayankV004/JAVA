class BasicQ
{
    static class Queue
    {
        static int rear;
        static int front;
        static int[] arr;
        int size;

        Queue(int size)
        {
            arr = new int[size];
            this.size = size;
            rear = -1;
            front = 0;
        }

        public boolean isEmpty()
        {
            return rear == -1;
        }

        // Enqueue
        public void enqueue(int data)
        {
            if (rear == size - 1)
            {
                System.out.println("Full Queue");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        // Dequeue
        public int dequeue()
        {
            if (isEmpty())
            {
                System.out.println("Empty Queue");
                return -1;
            }
            int frontItem = arr[front];
            for (int i = 0; i < rear; i++)
            {
                arr[i] = arr[i + 1];
            }
            rear--;
            return frontItem;
        }

        // Peek
        public int peek()
        {
            if (isEmpty())
            {
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args)
    {
        Queue q = new Queue(10);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);

        while (!q.isEmpty())
        {
            System.out.println(q.peek());
            q.dequeue();
        }
    }
}
