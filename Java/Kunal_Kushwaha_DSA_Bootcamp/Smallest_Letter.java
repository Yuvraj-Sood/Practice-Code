import java.util.*;
/**
 * Smallest_Letter
 */
public class Smallest_Letter {

    public static void main(String[] args) {

}

public char nextGreatestLetter(char[] letters, char target) {
        int start = 0, end = letters.length - 1, mid = 0, found = 0;
        while (start <= end) {
            mid = (start + end) / 2; 

            if(target>letters[mid])
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        return letters[start % letters.length];
    }
}