public class Project {
    public static void main(String[] args) {
        System.out.println("Saluton :)");
        threeNPlusOne(22);
    }

    public static void threeNPlusOne(int x) {
        System.out.println(x);
        while (x > 1) {
            if (x % 2 == 0)
                x = x / 2;
            else
                x = 3 * x + 1;
            System.out.println(x);
        }
    }
}