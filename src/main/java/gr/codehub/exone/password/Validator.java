package gr.codehub.exone.password;

import java.util.HashMap;
import java.util.Map;

public class Validator implements Conditions {
    public int countComplex = 0;
    public Map<String, Integer> passwordSafe = new HashMap<>();


    public void mainValidator()  {
        passwordStrength();
        for (Map.Entry mapPass : passwordSafe.entrySet()) {
            int value = (Integer) mapPass.getValue();
            if (value < 3) {
                System.out.println(mapPass.getKey() + ": Invalid Password");
                Rules.printRules();
            }
            else if (hasDIGIT(mapPass.getKey().toString()) && isNOT_SEQ_CON(mapPass.getKey().toString()) ||
                    hasSPECIAL_CHAR(mapPass.getKey().toString()) && isNOT_SEQ_CON(mapPass.getKey().toString()))
                System.out.println("Password OK");
            else if (hasMIN_LEN(mapPass.getKey().toString()) && isNOT_SEQ_CON(mapPass.getKey().toString()))
                System.out.println("Strong password");
            else if (value > 6)
                System.out.println("Very Strong password");
        }
    }

    public void passwordStrength() {
        for (String password : RegExp.passwords) {
            if (password.matches(MIN_LEN)) {
                this.countComplex = 0;
                if (hasDIGIT(password))
                    countComplex++;
                if (hasUPPERCASE(password))
                    countComplex++;
                if (hasLOWERCASE(password))
                    countComplex++;
                if (hasSPECIAL_CHAR(password))
                    countComplex++;
                if (hasMIN_LEN(password))
                    countComplex++;
                if (isNOT_SEQ_CON(password))
                    countComplex++;
            } else {
                System.out.println(password +": Invalid Password!");
                Rules.printRules();
            }
            passwordSafe.put(password, countComplex);
        }

    }

    public boolean hasDIGIT(String password) {
        boolean flag = false;
        if (password.matches(DIGIT))
            flag = true;
        return flag;
    }

    public boolean hasUPPERCASE(String password) {
        boolean flag = false;
        if (password.matches(UPPERCASE))
            flag = true;
        return flag;
    }

    public boolean hasLOWERCASE(String password) {
        boolean flag = false;
        if (password.matches(LOWERCASE))
            flag = true;
        return flag;
    }

    public boolean hasSPECIAL_CHAR(String password) {
        boolean flag = false;
        if (password.matches(SPECIAL_CHAR))
            flag = true;
        return flag;
    }

    public boolean hasMIN_LEN(String password) {
        boolean flag = false;
        if (password.matches(MIN_LEN))
            flag = true;
        return flag;
    }

    public boolean isNOT_SEQ_CON(String password) {
        boolean flag = false;
        if (!password.matches(SEQUENTIAL) && !password.matches(CONSECUTIVE))
            flag = true;
        return flag;
    }
}
