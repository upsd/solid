package interface_segregation.obeying;

public class BlackAndWhitePrinterOneThousand implements BlackAndWhitePrinter {

    @Override
    public void print() {
        System.out.print("Printing in Black and White");
    }
}
