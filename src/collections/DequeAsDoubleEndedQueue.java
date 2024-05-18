package collections;

import java.util.Deque;
import java.util.LinkedList;

public class DequeAsDoubleEndedQueue {

    public static void main(String[] args) {

        Deque<Integer> nums = new LinkedList<>();
        nums.addFirst(9);
        nums.offerFirst(-11);
        nums.addLast(5);
        System.out.println(nums);
        nums.addFirst(20);
        System.out.println(nums);
        nums.pollFirst();
        System.out.println(nums);
        nums.offerFirst(30);
        System.out.println(nums);
    }
}
