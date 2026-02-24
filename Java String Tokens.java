import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        // Split on any non-alphabetic character
        String[] tokens = s.trim().split("[^A-Za-z]+");
        
        // Handle empty input case
        if (s.trim().isEmpty()) {
            System.out.println(0);
            return;
        }
        
        System.out.println(tokens.length);
        for (String token : tokens) {
            System.out.println(token);
        }
    }
}
