class QueueLL
{
    static class Node
    {
        int data;
        Node next;
        Node (int data)
        {
            this.data = data;
            next = null;
        }
    }
    static class Queue
    {
        static Node head = null; 
        static Node tail = null;


        public static boolean isEmpty()
        {
            return head == null && tail == null;
        }

        public static void add(int data)
        {
            Node newnode = new Node(data);
            if (tail == null)
            {
                tail = head = newnode;
                return ;
            }
            tail.next = newnode;
            tail = newnode;
        }

        public static int remove ()
        {
            if (isEmpty())
            {
                System.out.println("Queue Is Empty");
                return -1;
            }
            
            int res = head.data;
            
            if (head == tail)
            {
                tail = null;
            }
            head = head.next ;
            return res;
        }
        public static int peek ()
        {
            if (isEmpty())
            {
                System.out.println("Queue is Empty");
                return -1;
            }
            return head.data;
        }
        public static void Display()
        {
            if (isEmpty())
            {
                System.out.println("Queue is Empty");
                return;
            }
            Node temp = head;
            while(temp != null)
            {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public static void main(String [] args)
    {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.Display();

        q.remove();
        q.Display();
    }
}