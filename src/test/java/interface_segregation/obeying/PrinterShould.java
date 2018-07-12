package interface_segregation.obeying;

import org.junit.Test;

public class PrinterShould {

    @Test
    public void print_in_colour() {
        ColourPrinterTwoThousand colourPrinterTwoThousand = new ColourPrinterTwoThousand();

        colourPrinterTwoThousand.print();
    }

    @Test
    public void print_in_black_and_white() {
        BlackAndWhitePrinterOneThousand blackAndWhitePrinterOneThousand = new BlackAndWhitePrinterOneThousand();

        blackAndWhitePrinterOneThousand.print();
    }
}
