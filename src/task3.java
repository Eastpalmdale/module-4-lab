public class task3 {
    public static void main(String[] args) {
        // variables
        double creditCardDebt=5000;
        double INTERESTRATE=1.17;
        double monthOne=0;
        double monthTwo=0;
        // computations in animation
        monthOne= creditCardDebt * INTERESTRATE;
        monthTwo = monthOne * INTERESTRATE;
        System.out.println("Your debt after one month is, " + monthOne + " Your debt after two month is, " + monthTwo);


}}
