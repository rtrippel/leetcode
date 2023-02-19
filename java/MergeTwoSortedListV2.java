public class MergeTwoSortedListV2 {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return  list2;
        if (list2 == null) return  list1;

        ListNode result;
        ListNode resultCurrentNode;
        //why doesn't work with list1, list2?
        ListNode l1 = list1;
        ListNode l2 = list2;

        if (l1.val < l2.val) {
            //will use old node
            resultCurrentNode = result = new ListNode(l1.val);
            l1 = l1.next;
        } else {
            resultCurrentNode = result = new ListNode(l2.val);
            l2 = l2.next;
        }

        while (true) {
            if (l1 == null) {
                resultCurrentNode.next = l2;
                break;
            }
            if (l2 == null) {
                resultCurrentNode.next = l1;
                break;
            }
            if (l1.val < l2.val) {
                resultCurrentNode.next = l1;
                resultCurrentNode = resultCurrentNode.next;
                l1 = l1.next;
            } else {
                resultCurrentNode.next = l2;
                resultCurrentNode = resultCurrentNode.next;
                l2 = l2.next;
            }
        }

        return result;
    }
}