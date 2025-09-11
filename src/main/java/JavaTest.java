
public class JavaTest {
    public static void main(String[] args) {
        int n = 10;

        for (int i = 0; i < n; i++) {
            System.out.print(printFibinocciNumbers(i) + " ");
        }
    }

    private static int printFibinocciNumbers(int n) {
            if (n <=1) {
                return 1;
        }

            return printFibinocciNumbers(n-1) + printFibinocciNumbers(n -2);



    }


}