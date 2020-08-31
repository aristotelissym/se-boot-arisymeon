package gr.codehub.exone.password;

public interface Conditions {
    String DIGIT = "^(?=.*\\d).+$";//At least one digit rule
    String UPPERCASE = "^*.(?=.*[A-Z]).*$";//At least one uppercase rule.
    String LOWERCASE = "^*.(?=.*[a-z]).*";//At least one lowercase rule.
    String SPECIAL_CHAR = "^*.(?=.*\\W).*$";//At lease one special character.
    String MIN_LEN = "^.{8,}$";//Minimum length.
    String SEQUENTIAL =
            "^.*(abc|bcd|cde|def|efg|fgh|ghi|hij|ijk|jkl|klm|lmn|" +
                    "mno|nop|opq|pqr|qrs|rst|stu|tuv|uvw|vwx|wxy|xyz|012|123|234|345|456|567|678)+.*$";
    String CONSECUTIVE = "^.*(.)\\1\\1.*$";

}
