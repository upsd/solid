package interface_segregation.not_obeying;

public class BlackAndWhitePrinter implements Printer {
    @Override
    public void printInColour() {

    }

    @Override
    public void printInBlackAndWhite() {
        System.out.print("Printing in Black and White");
    }
}
