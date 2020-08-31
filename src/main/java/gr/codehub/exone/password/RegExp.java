package gr.codehub.exone.password;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp {
    static ArrayList<String> passwords = new ArrayList<>(Arrays.asList("0aB@ZZaa43#@", "abcrtw#ES32", "asbj5#",
            "aaaaaaaaaa"));

    String regExp =
            "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*\\W)(?=\\S+$).{8,}$";
    String seqExp =
            ".*(abc|bcd|cde|def|efg|fgh|ghi|hij|ijk|jkl|klm|lmn|mno|" +
                    "nop|opq|pqr|qrs|rst|stu|tuv|uvw|vwx|wxy|xyz|012|123|234|345|456|567|678)+.*";


    public void passwordReader() {
        Pattern pattern = Pattern.compile(regExp);

        if (!passwords.isEmpty())
            for (String password : passwords) {
                Matcher matcher = pattern.matcher(password);
                if (matcher.matches() && !password.matches("(?i).*(.)\\1\\1.*") && !password.matches(seqExp))
                    System.out.println("Pattern Matched password: " + password);
                else
                    System.out.println("Password " + password + " does not follow the requirements of the Pattern");
            }
        else
            System.out.println("No password was given!");
    }
}
