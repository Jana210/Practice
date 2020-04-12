
public class AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode result = new ListNode(0);
		ListNode firstNode = l1, secondNode = l2, current = result;
		int carry = 0;
		while (firstNode != null || secondNode != null) {
			int firstNodeValue = (firstNode != null) ? firstNode.val : 0;
			int secNodeValue = (secondNode != null) ? secondNode.val : 0;
			int sum = carry + firstNodeValue + secNodeValue;
			carry = sum / 10;
			current.next = new ListNode(sum % 10);
			current = current.next;
			if (firstNode != null)
				firstNode = firstNode.next;
			if (secondNode != null)
				secondNode = secondNode.next;
		}
		if (carry > 0) {
			current.next = new ListNode(carry);
		}

		return result.next;
	}
}
