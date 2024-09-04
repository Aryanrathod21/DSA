public class subsequence {
    public static void printSubSeq(String str,int idx,String newStr){
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        char newChar = str.charAt(idx);
        printSubSeq(str, idx+1, newStr+newChar);
        printSubSeq(str, idx+1, newStr);
    }
    public static void main(String[] args) {
        String str = "abc";
        printSubSeq(str, 0, "");

    }
}
