import java.util.*;

//class CharData {
//    char ch;
//    int ascii;
//    int pos;
//    public CharData(char ch, int ascii, int pos) {
//        this.ch = ch;
//        this.ascii = ascii;
//        this.pos = pos;
//    }
//}
public class SortStringAccToAscii {
    public static void main(String[] args) {
        String s = "ShyamKumar";

        char[] ch = s.toCharArray();

        char[] sortedCh = ch.clone();
        Arrays.sort(sortedCh);

        for(char cha: sortedCh) {
            for (int i = 0; i < ch.length; i++) {
                if (cha == ch[i]) {
                    System.out.println(cha + " -> " + (int)cha + " " + i + " ");
                    ch[i] = ' ';
                    break;
                }
            }
        }
//        List<CharData> list = new ArrayList<>();
//        for (int i = 0; i < ch.length; i++) {
//            CharData cd = new CharData(ch[i], (int) ch[i], i);
//            list.add(cd);
//        }
//        Map<Integer, Integer> map = new HashMap<>();
//                Arrays.sort(ch);
//
//        for (Character cha: ch) {
//
//            for (CharData cData: list) {
//                if (cha == cData.ch) {
//                    System.out.println(cha + " -> " + cData.ascii + " " + cData.pos + " ");
//                    list.remove(cData);
//                    break;
//                }
//            }
//        }

    }
}