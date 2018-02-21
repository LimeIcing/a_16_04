public class ListNode04 {
    public int data; // data stored in this node
    public ListNode04 next; // link to next node in the list

    // post: constructs a node with data 0 and null link
    public ListNode04() {
        this(0, null);
    }

     // post: constructs a node with given data and null link
    public ListNode04(int data) {
        this(data, null);
    }

    // post: constructs a node with given data and given link
    public ListNode04(int data, ListNode04 next) {
        this.data = data;
        this.next = next;
    }
}