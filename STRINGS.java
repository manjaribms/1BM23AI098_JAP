public class STRINGS {


    public static boolean compareStrings(String str1, String str2) {
        return str1.equals(str2);
    }


    public static String copyString(String str) {
        return new String(str);
    }

    public static String concatenateStrings(String str1, String str2) {
        return str1 + str2;

    }
    public static void main(String[] args) {

        String string1 = "Hello, ";
        String string2 = "World!";
        String string3 = "Goodbye, World!";

        boolean isEqual = compareStrings(string1, string2);
        System.out.println("Are string1 and string2 equal? " + isEqual);

        String copiedString = copyString(string1);
        System.out.println("Copied String: " + copiedString);

        String concatenatedString = concatenateStrings(string1, string2);
        System.out.println("Concatenated String: " + concatenatedString);

        isEqual = compareStrings(string1, string3);
        System.out.println("Are string1 and string3 equal? " + isEqual);
    }
}



