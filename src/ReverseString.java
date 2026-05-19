public class ReverseString {
    public static void main(String[] args) {
        String str = "Farid";
        String s = "";

        for (int i = 0; i < str.length(); i++) {
            s = str.charAt(i) + s;
        }
        System.out.println(s);
    }
}
