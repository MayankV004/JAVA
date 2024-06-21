class BasicsLL {
    ListNode head;
    private int size;

    BasicsLL() {
        size = 0;
    }

    public class ListNode {
        String val;
        ListNode next;

        ListNode(String val) {
            this.val = val;
            this.next = null;
        }
    }

    public void InsertStart(String data) {
        ListNode newnode = new ListNode(data);
        newnode.next = head;
        head = newnode;
        size++;
    }

    public void InsertLast(String data) {
        ListNode newnode = new ListNode(data);
        if (head == null) {
            head = newnode;
            return ;
        } else {
            ListNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnode;
        }
        size++;
    }

    public void DeleteFirst() {
        if (head == null) {
            System.out.println("The list is Empty");
            return;
        }
        head = head.next;
        size--;
    }

    public void DeleteLast() {
        if (head == null) {
            System.out.println("The list is Empty");
            return;
        }
        if (head.next == null) {
            head = null;
        } else {
            ListNode secondLast = head;
            ListNode lastNode = head.next;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
                secondLast = secondLast.next;
            }
            secondLast.next = null;
        }
        size--;
    }
    public void DeleteFromMiddile(int index)
    {
        if (index > size || index < 0)
        {
            System.out.println("Invalid Index");
            return;
        }
        if (head == null) {
            System.out.println("The list is Empty");
            return;
        }
        if (head.next == null) {
            head = null;
        } 
        else if(index == 0)
        {
            head = head.next;
        }
        else {
            ListNode curr = head;
            for (int i = 1 ; i < size ; i++)
            {
                if ( i == index)
                {
                    ListNode nextNode = curr.next;

                    curr.next = nextNode.next;
                    nextNode.next = null;
                    break;
                }
                curr = curr.next;
            }
        }
        size--;
    }

    public void Display() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void reverseIterative()
    {
        if (head == null || head.next == null)
        {
            return;
        }
        ListNode prevNode = head;
        ListNode currNode = head.next;
        while (currNode != null)
        {
            ListNode nextNode = currNode.next;
            currNode.next = prevNode;

            // update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }
    public ListNode reverseRecursive(ListNode head)
    {
        if (head == null || head.next == null)
        {
            return head;
        }
        ListNode newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        BasicsLL list = new BasicsLL();
        list.InsertStart("A");
        list.InsertStart("B");
        list.InsertStart("C");
        list.InsertStart("D");
        list.Display();


        list.InsertLast("E");
        list.InsertLast("f");
        list.InsertLast("g");
        list.InsertLast("H");

        list.Display();

        // list.DeleteFirst();
        // list.DeleteFirst();
        // list.DeleteFirst();

        // list.Display();

        // list.DeleteLast();
        // list.DeleteLast();

        // list.Display();

        // list.reverseIterative();
        // list.Display();
        list.DeleteFromMiddile(6);
        // list.head = list.reverseRecursive(list.head);
        list.Display();
        // int size = list.getSize();
        // System.out.println(size);
    }
}
