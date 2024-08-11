public class Strings {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        System.out.println(sb.charAt(0));

        sb.setCharAt(0, 'A');
        System.out.println(sb);

    }
}
