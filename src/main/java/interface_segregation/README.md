# Interface Segregation
In the original example we had both `BlackAndWhitePrinter` and `ColourPrinter` implementing the `Printer` interface.
However, as we can see from the below, each implementation only implements one of the methods:
```java
public class ColourPrinter implements Printer {

    @Override
    public void printInColour() {
        System.out.print("Printing in Colour");
    }

    @Override
    public void printInBlackAndWhite() {

    }
}
```
```java
public class BlackAndWhitePrinter implements Printer {
    @Override
    public void printInColour() {

    }

    @Override
    public void printInBlackAndWhite() {
        System.out.print("Printing in Black and White");
    }
}
```
A better approach obeying the Interface Segregation Principle would be to have an interface per "client". Those classes
would now look something like the below:
```java
public class ColourPrinterTwoThousand implements ColourPrinter {

    @Override
    public void print() {
        System.out.print("Printing in Colour");
    }
}
```
```java
public class BlackAndWhitePrinterOneThousand implements BlackAndWhitePrinter {

    @Override
    public void print() {
        System.out.print("Printing in Black and White");
    }
}
```