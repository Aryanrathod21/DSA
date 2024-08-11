public class Strings {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        System.out.println(sb.charAt(0));

        sb.setCharAt(0, 'A');
        System.out.println(sb);

        sb.insert(0,'z');
        System.out.println(sb);

        sb.delete(1, 2);
        System.out.println(sb);

        sb.append('r');
        System.out.println(sb);
    }
}
