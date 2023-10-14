import java.util.Scanner;

/**
 * This class demonstrates the Television class.
 */

public class TelevisionDemo {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int station;         // user's channel choice

        // declare and instantiate a television object
        Television bigScreen = new Television("Toshiba", 55);

        // power on
        bigScreen.power();

        // Display the state of the television
        System.out.println("A " +
                bigScreen.getScreenSize() +
                " inch " +
                bigScreen.getManufacturer() +
                " has been turned on.");

        // Prompt the user for input and store into station
        System.out.print("What channel do you want? ");
        station = keyboard.nextInt();

        // Change the channel on the television
        bigScreen.setChannel(station);

        // increases the volume of the television
        bigScreen.increaseVolume();

        // displays the current channel and volume of the television

        System.out.println("Channel: " +
                bigScreen.getChannel() +
                " Volume: " +
                bigScreen.getVolume());
        System.out.println("Too loud! Lowering the volume.");

        // decreases the volume of the television
        bigScreen.decreaseVolume();
        bigScreen.decreaseVolume();
        bigScreen.decreaseVolume();
        bigScreen.decreaseVolume();
        bigScreen.decreaseVolume();
        bigScreen.decreaseVolume();

        // Display the current channel and volume of the television

        System.out.println("Channel: " +
                bigScreen.getChannel() +
                " Volume: " +
                bigScreen.getVolume());

        System.out.println();   // blank line


        Television portable = new Television("sharp", 19);
        portable.power();

        System.out.println("A " + portable.getScreenSize()
                + " inch " + portable.getManufacturer() + " has been turned on.");
        System.out.print("What channel do you want? ");
        station = keyboard.nextInt();

        bigScreen.setChannel(station);

        bigScreen.increaseVolume();
        bigScreen.increaseVolume();
        bigScreen.increaseVolume();

        System.out.println("Channel: " +
                bigScreen.getChannel() +
                " Volume: " +
                bigScreen.getVolume());

    }
}