package com.bridgelabz.JUnit.PasswordStrengthTest;

public class PasswordStrength {
    public boolean isValid(String pwd) {
        if(pwd==null || pwd.length()<8){
            return false;
        }
        boolean hasUppercase = false;
        boolean hasDigit = false;

        for (char c : pwd.toCharArray()) {
            if (Character.isUpperCase(c)) hasUppercase = true;
            if (Character.isDigit(c)) hasDigit = true;
        }

        return hasUppercase && hasDigit;
    }
}
