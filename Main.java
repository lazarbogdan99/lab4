public class Main {
    /*
    public static void main(String[] args){

        // an instance of the DVD class
        DVD dvd=new DVD(2.0, 5, 3.2, "DVD1", "DVD");

        // an instance of the CD class
        CD cd=new CD(1.0,4,4.5,"CD1","CD");

        // an instance of the Playable class
        Playable playable=new Playable(1.5, 3, 6.7, "Playable");

        //this block prints out messages about dvd
        System.out.println("The price of the DVD is "+dvd.getPrice());
        System.out.println("The numStock of the DVD is "+dvd.getNumStock());
        System.out.println("The runtime of the DVD is "+dvd.getRuntime());
        System.out.println("The rental cost of the DVD is "+dvd.getRentalCost());
        System.out.println("The title of the DVD is "+dvd.getTitle());
        System.out.println("The director of the DVD is "+dvd.getDirector()+"\n");

        //this block prints out messages about cd
        System.out.println("The price of the CD is "+cd.getPrice());
        System.out.println("The numStock of the CD is "+cd.getNumStock());
        System.out.println("The runtime of the CD is "+cd.getRuntime());
        System.out.println("The rental cost of the CD is "+cd.getRentalCost());
        System.out.println("The title of the CD is "+cd.getTitle());
        System.out.println("The artist of the CD is "+cd.getArtist()+"\n");

        //this block prints out messages about playable
        System.out.println("The price of a playable is "+playable.getPrice());
        System.out.println("The numStock of a playable is "+playable.getNumStock());
        System.out.println("The runtime of a playable is "+playable.getRuntime());
        System.out.println("The rental cost of a playable is "+playable.getRentalCost());
        System.out.println("The title of a playable is "+playable.getTitle());
    }
    */

    public static void main(String[] args)
    {
        // an instance of the DVD class
        DVD myDVD=new DVD(11.17,9,102, "Your Name", "Makoto Shinkai");
        Playable myPlayable=myDVD;

        //prints out a message
        System.out.println("The title: "+myPlayable.getTitle()+"\nThe runtime: "+myPlayable.getRuntime()+"\nThe rental cost: "+myPlayable.getRentalCost());

        //crating a new instance of dvd with tyhe value of myPlayable and then prints out a message
        DVD myDVD2;
        myDVD2=(DVD)myPlayable;
        System.out.println("\nThe director of myDVD2 is: "+myDVD2.getDirector());

        //prints out a message
        System.out.println("The director of myPlayable is: "+((DVD) myPlayable).getDirector());
    }

}
