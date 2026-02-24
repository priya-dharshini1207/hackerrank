import java.io.*;
import java.util.*;

public class Solution {

   
public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    int n = scn.nextInt();
    // Object str = "" + n;
    Object str = String.valueOf(n);

    if (str instanceof String) {
        System.out.println("Good job");
    } else {
        System.out.println("Wrong answer");
    }

    scn.close();
}

}
    
