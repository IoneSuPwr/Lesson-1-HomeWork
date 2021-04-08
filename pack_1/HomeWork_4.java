package pack_1;

public class HomeWork_4 {
    public static void main(String[] args) {
        printControl();
    }

    public static void printControl() {
        int value = 1984;
        if (value<=0) {
            System.out.println("Красный");
        }
        if (value>0 && value<=100) {
            System.out.println("Жёлтый");
        }
        if (100<value) {
            System.out.println("Зелёный");
        }
    }
}
