package gr.codehub.exone.password;

public class Rules {
    public static void printRules () {
        System.out.println("\n\nA Password should be accepted, if it meets the following criteria: ");
        System.out.println("1. Password contains at least one uppercase character");
        System.out.println("2. Password contains at least one lowercase character");
        System.out.println("3. Contains at least one number");
        System.out.println("4. Contains at least one special character (e.g., !, _ etc)");
        System.out.println("5. Password length must be at least 8 characters long");
        System.out.println("6. Cannot contain a sequence of 3 same " +
                "characters (i.e. aaa) or a sequence of 3 consecutive characters (i.e abc)\n\n");
    }
}







