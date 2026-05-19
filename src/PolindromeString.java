public class PolindromeString {

    public static boolean isPolidromeString(String s) {

       s = s.toLowerCase();

       String reverse = "";

       for (int i = s.length() - 1; i >= 0; i--) {
           reverse = reverse + s.charAt(i);
       }

       return s.equals(reverse);
    }


    public static void main(String[] args) {

        String s = "level";
        if (isPolidromeString(s)) {
            System.out.println("polidrome : " + s);
        }
        else  {
            System.out.println("not polidrome : " + s);
        }
    }
}
