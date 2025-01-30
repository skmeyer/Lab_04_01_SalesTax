public class Main {
    public static void main(String[] args)
    {
        double purchasePrice = 15.00;
        double TAX_RATE = 0.05;

        double salesTax = purchasePrice * TAX_RATE;
        double totalPrice = purchasePrice + salesTax;


        System.out.println("The total price of your purchase is " + totalPrice + " dollars. Your sales tax is " + salesTax + " cents.");

    }
}