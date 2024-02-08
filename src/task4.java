public class task4 {
    public static void main(String[] args) {
        // variables
        int numberExamined=7;
        int numberModulod=0;
        int divison=2;
        // checking for nerds
        numberModulod = numberExamined % divison;
        if (numberModulod > 0) {
            System.out.println("Your number is prime");
        }
        else {
            System.out.println("Your number is even");};

    }
}
