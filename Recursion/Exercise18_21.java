import java.util.Scanner;

public class Exercise18_21 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal integer: ");
        int decimal = input.nextInt();
        System.out.print("Enter a character; ");
        System.out.printf("%d decimal is binary %s", decimal, dec2Bin(decimal));
    }

    // input: integer
    // ouptut: binary representation of integer as a string
    public static String dec2Bin(int decimal){
        return successiveDivision(decimal);
    }

    public static String successiveDivision(int dec){
        if (dec <= 0){
            return "";
        }
        else {
            int bit = dec % 2;
            System.out.println(bit);
            return successiveDivision(dec/2) + bit;
        }
    }
}
