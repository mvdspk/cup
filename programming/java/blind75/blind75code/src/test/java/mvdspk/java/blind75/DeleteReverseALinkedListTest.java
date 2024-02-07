package mvdspk.java.blind75;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

public class DeleteReverseALinkedListTest {
    @Test
    public void testStackApproach() {
        List<String> inputList = Arrays.asList("a", "b", "c");

        DeleteReverseALinkedList reverseALinkedList = new DeleteReverseALinkedList();
        List<String> reversedList = reverseALinkedList.usingStackApproach(inputList);

        assertEquals(inputList.size(), reversedList.size());
        for(int i = 0; i < inputList.size(); i++){
            assertEquals(inputList.get(i), reversedList.get(inputList.size() -1-i));
        }
    }



    @Test
    public void testStackApproachOneElement() {
        List<String> inputList = Arrays.asList("a");

        DeleteReverseALinkedList reverseALinkedList = new DeleteReverseALinkedList();
        List<String> reversedList = reverseALinkedList.usingStackApproach(inputList);

        assertEquals(inputList.size(), reversedList.size());
        for(int i = 0; i < inputList.size(); i++){
            assertEquals(inputList.get(i), reversedList.get(inputList.size() -1-i));
        }
    }
}
