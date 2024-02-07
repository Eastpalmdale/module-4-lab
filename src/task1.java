public class task1 {
    public static void main(String[] args) {
        // variables
        double SALESTAX1=.05;
        double SALESTAX2=1.05;
        double price=75;
        double outputSalesTaxCut=0;
        double finalPrice=0;
        // equations for tax
        outputSalesTaxCut= price * SALESTAX1;
        finalPrice= price * SALESTAX2;
        System.out.println("Your final price is, " + finalPrice + " and the sales tax cut is, " + outputSalesTaxCut);



}}
