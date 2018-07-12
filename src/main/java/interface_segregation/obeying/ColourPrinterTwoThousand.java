package interface_segregation.obeying;

public class ColourPrinterTwoThousand implements ColourPrinter {

    @Override
    public void print() {
        System.out.print("Printing in Colour");
    }
}
