import mypackage.Addition;

public class Packageee {
    public static void main(String args[]) {
        Addition a = new Addition();
        int sum = a.add(2, 8);
        System.out.println("Sum is: " + sum);
    }
}
