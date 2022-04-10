package week02;

public class EmoloyeeInfo {

    public static void main(String[] args) {

        /*
         * name
         * companyName
         * jobTitle
         * gender char
         * salary
         * employeeID
         * hasBenefits(Y/N) boolean
         * isMarried char
         *
         *
         */

        String name = "John Locke";
        String companyName = "Apple Inc";
        String jobTitle = "SDET";
        char gender = 'M';
        double salary = 123456;
        String employeeId = "A-23";
        boolean hasBenefits = true;
        char isMarried = 'N';

        System.out.println("name = " + name);
        System.out.println("companyName = " + companyName);
        System.out.println("jobTitle = " + jobTitle);
        System.out.println("gender = " + gender);
        System.out.println("salary = " + salary);
        System.out.println("employeeId = " + employeeId);
        System.out.println("hasBenefits = " + hasBenefits);
        System.out.println("isMarried = " + isMarried);


    }
}
