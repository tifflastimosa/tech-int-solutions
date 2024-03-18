package LeetCode;

import SinglyLinkedList.Node;

class ListNode {

  int val;
  ListNode next;

  public ListNode() {
  }

  public ListNode(int val) {
    this.val = val;
    this.next = null;
  }

  public ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }

  public void add(ListNode prev, ListNode toAdd) {
    prev.next = toAdd;
  }
}

class AddTwoNumbers {

  public static ListNode solution(ListNode l1, ListNode l2) {
    int[] l1res = sumFromListNode(l1);
    int[] l2res = sumFromListNode(l2);
    int sum = l1res[0] + l2res[0];
    System.out.println(sum);






    return new ListNode();
  }


  private static int[] sumFromListNode(ListNode head) {
    int sum = 0;
    int multiplier = 1;
    ListNode current = head;

    while (current != null) {
      sum += current.val * multiplier;
      multiplier *= 10;
      current = current.next;
    }
    return new int[]{sum, multiplier/10};
  }

  public static void main(String[] args) {
    ListNode two = new ListNode(2);
    ListNode four = new ListNode(4);
    ListNode three = new ListNode(3);

    two.add(two, four);
    four.add(four, three);

    ListNode five = new ListNode(5);
    ListNode six = new ListNode(6);
    ListNode four2 = new ListNode(4);

    two.add(five, six);
    four.add(six, four2);
    solution(two, five);

  }



}

