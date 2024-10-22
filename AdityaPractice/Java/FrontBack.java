package AdityaPractice.Java;

/**
 * FrontBack
 */
public class FrontBack {

    public static void main(String[] args) {
        System.out.println("*************Print***********\n");
        String name = "Hello";
        String value = frontBack(name);
        // String newValue = frontBackCorrect(name);
        System.out.println(value);

    }

    public static String frontBack(String str) {
        if (!str.isEmpty()) {
            String[] strArray = str.split("");
            if (strArray.length >= 1) {
                String temp = strArray[0];
                strArray[0] = strArray[strArray.length - 1];
                strArray[strArray.length - 1] = temp;
            }
            return String.join("", strArray);
        } else {
            return str;
        }

    }

    public static String frontBackCorrect(String str) {
        if (str.length() <= 1)
            return str;

        String mid = str.substring(1, str.length() - 1);

        // last + mid + first
        return str.charAt(str.length() - 1) + mid + str.charAt(0);
    }
}