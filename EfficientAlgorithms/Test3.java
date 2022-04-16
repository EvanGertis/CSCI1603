import java.util.*;

/*
    name: Evan Getis
    date: 04/02
    program: print out longest subsequence
*/
public class Test3 {
		// Main method
		//input: Enter a series of numbers ending with 0: 2 4 4 8 8 8 8 2 4 4 0
		//output: The longest same number sequence starts at index 3 with 4 values of 8
		public static void main(String[] args){
			ArrayList<Integer> list = new ArrayList<Integer>();

			Scanner input = new Scanner(System.in);
			// Prompt the user to enter a sequence of numbers ending with 0
			System.out.print("Enter a series of numbers ending wih 0: ");
			Integer number = input.nextInt();
			while (number.intValue() != 0) {
				list.add(number);
				number = input.nextInt();
			}
			System.out.println(list);
			longestSequence(list);
		}

		public static int longestSequence(ArrayList<Integer> inputs) {
			int seqLength = 1;
			int largestSeqLength = seqLength;
			int currentInt = 0;
			int previousInt = 0;
			int value = 0;
			
			for (Integer currentInput : inputs) {
				currentInt = currentInput;

				if( currentInt == previousInt){
					seqLength++;

					// store max value so far
					if( seqLength > largestSeqLength){
						largestSeqLength = seqLength;
						value = currentInput;
					}
				}else{
					// reset sequence length
					seqLength = 1;
				}
				previousInt = currentInt;
			}
			System.out.printf("The longest same number sequence starts at index %d with %d values of %d ",inputs.indexOf(value),largestSeqLength,value);
			return largestSeqLength;
		}
}

