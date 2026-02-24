import java.util.*;

public class Solution {

public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
    String A=sc.next();
    String B=sc.next();

    int a1=A.length();//length of A
    int b1=B.length();//length of B
    System.out.println(a1+b1);//Adding length of a1 &b1
    if(A.compareTo(B)>0){
        System.out.println("Yes");//Lexicographical comparision 

    }
    else{
        System.out.println("No");
    }
    String A1=A.substring(0,1).toUpperCase()+A.substring(1);//switching case
    String B1=B.substring(0,1).toUpperCase()+B.substring(1);
    System.out.println(A1+" "+B1);




}

}
