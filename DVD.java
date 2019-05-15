/**
 * A class that models a DVD and inherits the properties of a playable product
 * */

public class DVD extends Playable {
    private String director;


    /**
     * Create a new DVD
     *
     * @param price    The price of the DVD in pounds.
     * @param numStock The amount of the DVD in stock.
     * @param runtime  The runtime of the DVD.
     * @param title    The title of the DVD.
     * @param director The director of the DVD.
     */
    public DVD(double price, int numStock, double runtime, String title, String director) {
        setPrice(price);
        setNumStock(numStock);
        setRuntime(runtime);
        setTitle(title);
        setDirector(director);
    }

    /**
     * Set the director of the DVD
     * @param director The director of the DVD
     */
    public void setDirector(String director) {
        this.director=director;
    }

    /**
     * Get the director of the DVD.
     * @return The director of the DVD.
     */
    public String getDirector() {
        return this.director;
    }

    /**
     * Get the rental cost of the product
     * @return The rental cost of the product
     * */
    @Override
    public double getRentalCost() {
        this.rentalCost=1.2;
        return this.rentalCost;
    }

}

