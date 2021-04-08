package pack_1;

public class HomeWork_3 {
    public static void main(String[] args) {
        checkSumSign();
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
}
