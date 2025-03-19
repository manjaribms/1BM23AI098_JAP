import java.util.Scanner;

public class s_b {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();


        StringBuffer stringBuffer = new StringBuffer(userInput);

        stringBuffer.append(" - Modified by StringBuffer.");

        System.out.println("After appending text: " + stringBuffer);

        stringBuffer.reverse();

        System.out.println("After reversing the string: " + stringBuffer);

        scanner.close();
    }
}
