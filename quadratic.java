import java.util.Scanner;

public class quadratic {
    public static void main(String[ ] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter the coefficient a: ");
double a = input.nextDouble();
System.out.print("Enter the coefficient b: ");
double b = input.nextDouble();
System.out.print("Enter the coefficient c: ");
double c = input.nextDouble();
double discriminant = b * b - 4 * a * c;
if (discriminant > 0) {
// Two distinct real roots
double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
System.out.printf("The roots are %.2f and %.2f%n", root1, root2);
} else if (discriminant == 0) {
// One real and repeated root
double root = -b / (2 * a);
System.out.printf("The root is %.2f%n", root);
} else {
// Two complex roots

double realPart = -b / (2 * a);
double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
System.out.printf("The roots are %.2f + %.2fi and %.2f - %.2fi%n", realPart,
imaginaryPart, realPart, imaginaryPart);
}
input.close();
    
}
}
