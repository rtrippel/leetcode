public class MergeTwoSortedListV3 {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return  list2;
        if (list2 == null) return  list1;

        ListNode result;
        ListNode resultCurrentNode;

        if (list1.val < list2.val) {
            resultCurrentNode = result = new ListNode(list1.val);
            list1 = list1.next;
        } else {
            resultCurrentNode = result = new ListNode(list2.val);
            list2 = list2.next;
        }

        while (true) {
            if (list1 == null) {
                resultCurrentNode.next = list2;
                break;
            }
            if (list2 == null) {
                resultCurrentNode.next = list1;
                break;
            }
            if (list1.val < list2.val) {
                resultCurrentNode.next = new ListNode(list1.val);
                resultCurrentNode = resultCurrentNode.next;
                list1 = list1.next;
            } else {
                resultCurrentNode.next = new ListNode(list2.val);
                resultCurrentNode = resultCurrentNode.next;
                list2 = list2.next;
            }
        }

        return result;
    }
}