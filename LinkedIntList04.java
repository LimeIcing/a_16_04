// Class LinkedIntList can be used to store a list of integers.

public class LinkedIntList04 {

    /*
    Write a method called lastIndexOf that accepts an integer value as a parameter and that returns the index in the
    list of the last occurrence of that value, or -1 if the value is not found in the list. For example, if a variable
    list stores the values [1, 18, 2, 7, 18, 39, 18, 40] , then the call of list.lastIndexOf(18) should return 6 . If
    the call had instead been list.lastIndexOf(3) , the method would return -1 .
     */

    public int lastIndexOf(int value) {
        int lastIndex = -1;
        ListNode04 current = front;
        int counter = 0;

        while (current != null) {
            if (value == current.data) {
                lastIndex = counter;
            }
            counter++;
            current = current.next;
        }

        return lastIndex;
    }

    // Everything below is copied from the book

    private ListNode04 front; // first value in the list

    // post: constructs an empty list
    public LinkedIntList04() {
        front = null;
    }

    // post: returns the current number of elements in the list
    public int size() {
        int count = 0;
        ListNode04 current = front;
        while (current != null) {
            current = current.next;
            count++;
        }
        return count;
    }

    // pre : 0 <= index < size()
    // post: returns the integer at the given index in the list
    public int get(int index) {
        return nodeAt(index).data;
    }

    // post: returns comma-separated, bracketed version of list
    public String toString() {
        if (front == null) {
            return "[]";
        } else {
            String result = "[" + front.data;
            ListNode04 current = front.next;
            while (current != null) {
                result += ", " + current.data;
                current = current.next;
            }
            result += "]";
            return result;
        }
    }

    // post: returns the position of the first occurrence of the
    // given value (-1 if not found)
    public int indexOf(int value) {
        int index = 0;
        ListNode04 current = front;
        while (current != null) {
            if (current.data == value) {
                return index;
            }
            index++;
            current = current.next;
        }
        return -1;
    }

    // post: appends the given value to the end of the list
    public void add(int value) {
        if (front == null) {
            front = new ListNode04(value);
        } else {
            ListNode04 current = front;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new ListNode04(value);
        }
    }

    // pre: 0 <= index <= size()
    // post: inserts the given value at the given index
    public void add(int index, int value) {
        if (index == 0) {
            front = new ListNode04(value, front);
        } else {
            ListNode04 current = nodeAt(index - 1);
            current.next = new ListNode04(value, current.next);
        }
    }

    // pre : 0 <= index < size()
    // post: removes value at the given index
    public void remove(int index) {
        if (index == 0) {
            front = front.next;
        } else {
            ListNode04 current = nodeAt(index - 1);
            current.next = current.next.next;
        }
    }

    // pre : 0 <= i < size()
    // post: returns a reference to the node at the given index
    private ListNode04 nodeAt(int index) {
        ListNode04 current = front;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

}