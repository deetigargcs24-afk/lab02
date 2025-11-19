import java.util.*;
import CIE.*;
import SEE.*;

public class FinalMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Internals internal[] = new Internals[n];
        External external[] = new External[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Student " + (i + 1));

            System.out.print("USN: ");
            String usn = sc.next();

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Semester: ");
            int sem = sc.nextInt();

            int internalMarks[] = new int[5];
            System.out.println("Enter 5 internal marks: ");
            for (int j = 0; j < 5; j++)
                internalMarks[j] = sc.nextInt();

            int seeMarks[] = new int[5];
            System.out.println("Enter 5 SEE marks: ");
            for (int j = 0; j < 5; j++)
                seeMarks[j] = sc.nextInt();

            internal[i] = new Internals(internalMarks);
            external[i] = new External(usn, name, sem, seeMarks);
        }

        // Display final marks
        System.out.println("\n\n----- FINAL MARKS OF STUDENTS -----");
        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));
            System.out.println("USN  : " + external[i].usn);
            System.out.println("Name : " + external[i].name);
            System.out.println("Sem  : " + external[i].sem);

            System.out.println("Final Marks in 5 Courses:");

            for (int j = 0; j < 5; j++) {
                int finalMarks = internal[i].internalMarks[j] + (external[i].seeMarks[j] / 2);
                System.out.println("Course " + (j + 1) + " : " + finalMarks);
            }
        }

        sc.close();
    }
}
