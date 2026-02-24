import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        
        if (n < 0 || n > 100000) {
            throw new IllegalArgumentException("The number of people-phones cannot be lower than 0 or greater than 100,000");
        }
        
        Map<String, Integer> phoneBook = new HashMap<>();
        
        in.nextLine();
        
        for(int i=0; i<n; i++) {
            String name = in.nextLine().toLowerCase();
            Integer phone = in.nextInt();
            in.nextLine();
            
            if (String.valueOf(phone).length() != 8) {
                throw new IllegalArgumentException(String.format("The phone number %s is not 8 digits long", phone));
            }
            
            phoneBook.put(name, phone);
        }
        
        while(in.hasNext()) {
            String s = in.nextLine().toLowerCase();
            
            Integer phone = phoneBook.get(s);
            
            if (phone == null) {
                System.out.println("Not found");
            } else {
                System.out.println(String.format("%s=%d", s, phone));
            }
        }
    }
}

