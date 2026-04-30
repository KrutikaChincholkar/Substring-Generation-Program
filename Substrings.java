import java.util.Scanner;

public class SubstringGeneration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();

        int len = str.length();

        System.out.println("All substrings are:");
        for(int i = 0; i < len; i++) {
            for(int j = i; j < len; j++) {
                for(int k = i; k <= j; k++) {
                    System.out.print(str.charAt(k));
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
