import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;
import java.util.Arrays;

public class Exercise20_14 {
    public static void main(String args[]) {
        // Check number of arguments passed
        if (args.length != 1) {
            System.out.println(
            "Usage: java Exercise20_14 \"expression\"");
            System.exit(1);
        }
    
        try {
            System.out.println(evaluatePostFixExpression(args[0]));
        }
        catch (Exception ex) {
            System.out.println("Wrong expression: " + args[0]);
        }
    }

    public static Integer evaluatePostFixExpression(String expression){
        expression = cleanString(expression);
        // Create operatorStack to store operators
        Stack<Integer> stack = new Stack<>();

        // Step 1: Scan tokens
        for(int i =0; i < expression.length(); i++){
            char c = expression.charAt(i);
            // Step 2: push the variable to the stack
            if(Character.isDigit(c))
                stack.push(c - '0');
            else {
                int val1  = stack.pop();
                int val2  = stack.pop();
                // Step 3: apply the operator with the two operands
                switch(c) {
                    case '+':
                        stack.push(val2+val1);
                        break;
                    case '-':
                        stack.push(val2-val1);
                        break;
                    case '/':
                        stack.push(val2/val1);
                        break;
                    case '*':
                        stack.push(val2*val1);
                        break;
                }
            }
        }
        return stack.pop();
    }

    public static String cleanString(String s) {
        return s.replace(" ", "");
    }
}
