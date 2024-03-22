package Java.Telusko_Java_Assignmnet.Assignment_1;
//problem statement: create a ajava program to check if a given string is a palindrom or not.
import java.util.*;

public class PalindromString {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String str1 = sc.nextLine();
            StringBuffer bf = new StringBuffer(str1);
            bf.reverse();
            if (str1.equals(bf.toString())) {
                System.out.println(str1 + " is palindrom String");
            } else {
                System.out.println(str1 + " is not a palindrom String");
            }
        }
    }
}
/*
 * output
 * deified
 * deified is palindrom String
 */
