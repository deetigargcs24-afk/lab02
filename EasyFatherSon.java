// Simple custom exception
class WrongAge extends Exception {
    WrongAge(String msg) {
        super(msg);
    }
}

// Father class
class Father {
    int age;

    Father(int age) throws WrongAge {
        if (age < 0)
            throw new WrongAge("Father's age cannot be negative");
        this.age = age;
    }
}

// Son class (derived from Father)
class Son extends Father {
    int sonAge;

    Son(int fAge, int sAge) throws WrongAge {
        super(fAge);  // call Father constructor

        if (sAge < 0)
            throw new WrongAge("Son's age cannot be negative");

        if (sAge >= fAge)
            throw new WrongAge("Son's age must be less than father's age");

        this.sonAge = sAge;
    }
}

// Main class
public class EasyFatherSon {
    public static void main(String[] args) {

        try {
            Father f = new Father(40);
            Son s = new Son(40, 20);
            System.out.println("Valid ages entered!");
        }
        catch (WrongAge e) {
            System.out.println(e.getMessage());
        }
    }
}
