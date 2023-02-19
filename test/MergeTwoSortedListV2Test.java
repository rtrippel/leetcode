import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Stream;


@SpringBootTest(classes = MergeTwoSortedListV2.class)
class MergeTwoSortedListV2Test {

    @Autowired
    MergeTwoSortedListV2 mergeTwoSortedListV2;




    public static Stream<Arguments> getInputAndOutput() {
        ListNode node2 = new ListNode(4);
        ListNode node1 = new ListNode(2, node2);
        ListNode head1 = new ListNode(1,node1);
        ListNode node5 = new ListNode(4);
        ListNode node4 = new ListNode(3,node5);
        ListNode head2 = new ListNode(1,node4);

        ListNode node6 = new ListNode(4);
        ListNode node7 = new ListNode(4,node6);
        ListNode node8 = new ListNode(3,node7);
        ListNode node9 = new ListNode(2,node8);
        ListNode node10 = new ListNode(1,node9);
        ListNode output1 = new ListNode(1,node10);

        return Stream.of(
                Arguments.of(head1, head2, output1)
        );
    }

    @ParameterizedTest
    @MethodSource("getInputAndOutput")
    public void testSuccess(ListNode listNode1, ListNode listNode2, ListNode output){

        ListNode result = mergeTwoSortedListV2.mergeTwoLists(listNode1, listNode2);
        Assertions.assertEquals(result, output);
    }


}