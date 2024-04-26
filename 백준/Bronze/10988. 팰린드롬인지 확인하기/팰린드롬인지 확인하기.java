
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        StringBuilder sb = new StringBuilder(word);
        StringBuilder word_reverse = sb.reverse();
        
        if(word.equals(word_reverse.toString())) {
            System.out.println("1");
        }
        else {
            System.out.println("0");
        }
    }
}