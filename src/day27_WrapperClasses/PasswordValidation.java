package day27_WrapperClasses;

public class PasswordValidation {

    public static void main(String[] args) {

    
        String pass = "1@238ccKK789";
        
        boolean isStrong = passwordValidation(pass);

        System.out.println("isStrong = " + isStrong);


    }

    public static boolean passwordValidation(String password){

        boolean isStrong = false;
        int checkList = 0;

        if (password.length() >= 8 && !password.contains(" ")){


            for (char each : password.toCharArray()) {
                if (Character.isDigit(each)){
                    checkList++;
                    break;
                }
            }
            for (char each : password.toCharArray()){
                if (Character.isLetter(each)){
                    checkList++;
                    break;
                }
            }
            for (char each : password.toCharArray()){
                if (!Character.isLetterOrDigit(each)){
                    checkList++;
                    break;
                }
            }
            for (char each : password.toCharArray()){
                if (Character.isLowerCase(each)){
                    checkList++;
                    break;
                }
            }
            for (char each : password.toCharArray()){
                if (Character.isUpperCase(each)){
                    checkList++;
                    break;
                }
            }
            
        }
        
        if (checkList == 5){
            
            isStrong = true;
        }

        return isStrong; 


    }
}
/*
PasswordValidation:
    Write a program that can verify if a password is a strong password. Characteristics of strong passwords are:
                1. Password MUST be at least have 8 characters long, and should not contain space
                2. PassWord should at least contain one upper case letter
                3. PassWord should at least contain one lower case letter
                4. Password should at least contain one special characters
                5. Password should at least contain a digit
 */