class CircularQ
{
    static class Queue
    {
        static int rear=-1;
        static int front=-1;
        static int[] arr;
        static int size;

        Queue(int size)
        {
            arr = new int[size];
            this.size = size;
            
        }

        public boolean isEmpty()
        {
            return rear == -1 && front == -1;
        }
        public boolean isFull()
        {
            return (rear+1)%size == front;
        }

        // Enqueue
        public void enqueue(int data)
        {
            if (isFull())
            {
                System.out.println("Full Queue");
                return;
            }
            //for 1st element
            if(front == -1)
            {
                front = 0;
            }
            rear = (rear + 1)%size;
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
            //single element
            if (front == rear)
            {
                rear = front = -1;
            }
            else
            {
                front = (front + 1 )% size;
            }
            
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
        Queue q = new Queue(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        System.out.println(q.dequeue());
        q.enqueue(6);
        System.out.println(q.dequeue());
        q.enqueue(7);

        while (!q.isEmpty())
        {
            System.out.println(q.peek());
            q.dequeue();
        }
    }
}
