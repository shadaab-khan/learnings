package random_challenges;

import java.util.*;
import java.util.LinkedList;

public class PalindromeStackQueue {
    Queue<Character> characterQueue = new LinkedList<>();
    Stack<Character> stacky = new Stack<>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        PalindromeStackQueue p = new PalindromeStackQueue();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is "
                + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }

    private Character dequeueCharacter() {
        return Objects.requireNonNull(characterQueue.remove());
    }

    private void enqueueCharacter(char c) {
        characterQueue.add(c);
    }

    private Character popCharacter() {
        return Objects.requireNonNull(stacky.pop());
    }

    private void pushCharacter(char c) {
        stacky.push(c);
    }

}
