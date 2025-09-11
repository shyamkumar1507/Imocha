public class StringToNum {
    public static void main(String[] args) {
        String s = "123";
        char[] ch = s.toCharArray();
        int num = 0;
        for (int i = 0; i < ch.length; i++) {
            num = num * 10 + (ch[i] - '0');
        }
        System.out.println(num);
    }
}
