/**
 * A class that models a CD and inherits the properties of a playable product
 *
 * */


public class CD extends Playable {
    private String artist;

    /**
     * Create a new CD
     *
     * @param price    The price of the CD in pounds.
     * @param numStock The amount of the CD in stock.
     * @param runtime  The runtime of the CD.
     * @param title    The title of the CD.
     * @param artist The director of the CD.
     */
    public CD(double price, int numStock, double runtime, String title, String artist) {
        setPrice(price);
        setNumStock(numStock);
        setRuntime(runtime);
        setTitle(title);
        setArtist(artist);
    }

    /**
     * Set the artist of the CD
     * @param artist The artist of the CD
     * */
    public void setArtist(String artist) {
        this.artist=artist;
    }

    /**
     * Get the artist of the CD.
     * @return The artist of the CD.
     */
    public String getArtist() {
        return this.artist;
    }
}