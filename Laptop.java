package HomeWork3;

public class Laptop {

    private double price;
    private double diagonal;
    User owner = new User();

    Laptop () {
        price = 300;
        diagonal = 15;
    }

    Laptop (double p, double d) {
        price = p;
        diagonal = d;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double priceS) {
        price = priceS;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonalS) {
        diagonal = diagonalS;
    }
}