import java.util.*;

public class MaxCount {
    /*
    * My method
    **/
//    public static void main(String[] args) {
//        String str;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the string : ");
//        str = scanner.next();
//        char[] letter = new char[str.length()];
//        int occurence = 0;
//        int count[];
//        for (int i = 0; i < str.length(); i++) {
//            letter[i] = str.charAt(i);
//        }
//        for (int i = 0; i < letter.length; i++) {
//            for (int j = 0; j < str.length(); j++) {
//                if (letter[i] == str.charAt(j)) {
//                    occurence++;
//                }
//            }
//            System.out.println(letter[i] + " occurs : " + occurence + "times");
//        }
//    }

    /*
    * Method 1
    * */

public static void main(String[] args) {
    String str = "grass is greener on the other side";
    int[] freq = new int[str.length()];
    char minChar = str.charAt(0), maxChar = str.charAt(0);
    int i, j, min, max;

    //Converts given string into character array
    char[] string = str.toCharArray();

    //Count each word in given string and store in array freq
    for(i = 0; i < string.length; i++) {
        freq[i] = 1;
        for(j = i+1; j < string.length; j++) {
            if(string[i] == string[j] && string[i] != ' ' && string[i] != '0') {
                freq[i]++;

                //Set string[j] to 0 to avoid printing visited character
                string[j] = '0';
            }
        }
    }

    //Determine minimum and maximum occurring characters
    min = max = freq[0];
    for(i = 0; i <freq.length; i++) {

        //If min is greater than frequency of a character
        //then, store frequency in min and corresponding character in minChar
//        if(min > freq[i] && freq[i] != '0') {
//            min = freq[i];
//            minChar = string[i];
//        }

        //If max is less than frequency of a character
        //then, store frequency in max and corresponding character in maxChar
//        if(max < freq[i]) {
//            max = freq[i];
//            maxChar = string[i];
//        }
        if(2 <= freq[i]) {
            max = freq[i];
            maxChar = string[i];
            System.out.println(maxChar+ " occurred "+max+" times");
        }
    }

//    System.out.println("Minimum occurring character: " + minChar);
//    System.out.println("Maximum occurring character: " + maxChar);
}

/*
* Method 2
**/
//    static final String TEST_CASE_1 = "Hello! Are you all fine? What are u doing today? Hey Guyz,Listen! I have a plan for today. Help!";
//
//
//    public static void main(String[] args) {
//        MaxCount test = new MaxCount();
//        List<Character> result = test.maximumOccurringChars(TEST_CASE_1, true);
//        System.out.println(result);
//    }
//
//
//    public List<Character> maximumOccurringChars(String str) {
//        return maximumOccurringChars(str, false);
//    }
//
//    // set skipSpaces true if you want to skip spaces
//    public List<Character> maximumOccurringChars(String str, Boolean skipSpaces) {
//        Map<Character, Integer> map = new HashMap<>();
//        List<Character> occurrences = new ArrayList<>();
//        int maxOccurring = 0;
//
//        // creates map of all characters
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//
//            if (skipSpaces && ch == ' ')      // skips spaces if needed
//                continue;
//
//            if (map.containsKey(ch)) {
//                map.put(ch, map.get(ch) + 1);
//            } else {
//                map.put(ch, 1);
//            }
//
//            if (map.get(ch) > maxOccurring) {
//                maxOccurring = map.get(ch);         // saves max occurring
//            }
//        }
//
//        // finds all characters with maxOccurring and adds it to occurrences List
//        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
//            if (entry.getValue() == maxOccurring) {
//                occurrences.add(entry.getKey());
//            }
//        }
//
//        return occurrences;
//    }

}