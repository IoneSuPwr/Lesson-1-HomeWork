package pack_1;

public class HomeWork_6 {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printControl();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 19;
        int b = 89;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        }
        if (c < 0) {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printControl() {
        int value = 1984;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 0 && value <= 100) {
            System.out.println("Жёлтый");
        }
        if (100 < value) {
            System.out.println("Зелёный");
        }
    }

    public static void compareNumbers() {
        int a = 1;
        int b = 2;
        if (a >= b) {
            System.out.println("a>=b");
        }
        if (a < b) {
            System.out.println("a<b");
        }
    }
}

