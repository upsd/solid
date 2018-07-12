package interface_segregation.not_obeying;

public class ColourPrinter implements Printer {

    @Override
    public void printInColour() {
        System.out.print("Printing in Colour");
    }

    @Override
    public void printInBlackAndWhite() {

    }
}
