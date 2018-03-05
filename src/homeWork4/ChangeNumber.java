package homeWork4;

public class ChangeNumber {
    public ChangeNumber(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a);
        System.out.println(b);

    }
}
