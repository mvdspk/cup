package mvdspk.java.blind75;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DeleteReverseALinkedList {
    public List<String> usingStackApproach(List<String> inputList) {

        // while travelling throught the input list
        // store each element in sa stck
        // at the end, pop each element from stack and forn a new linked list
        // this will createa reversed linked list with last element as first

        List<String> reversedList = new ArrayList<>();

        Stack<String> stack = new Stack<String>();

        inputList.stream().forEach(item -> stack.push(item));

        while (!stack.isEmpty()) {
            reversedList.add(stack.pop());
        }

        return reversedList;
    }

   

}
