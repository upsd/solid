package interface_segregation.not_obeying;

import org.junit.Test;

public class PrinterShould {

    @Test
    public void print_in_colour() {
        ColourPrinter colourPrinter = new ColourPrinter();

        colourPrinter.printInColour();
    }

    @Test
    public void print_in_black_and_white() {
        BlackAndWhitePrinter blackAndWhitePrinter = new BlackAndWhitePrinter();

        blackAndWhitePrinter.printInBlackAndWhite();
    }
}
