public class Television {
    private String MANUFACTURER; //the manufacteruer of the television
    private int SCREEN_SIZE;// the size of the television
    private boolean powerON; //checks if the tv is on
    private int channel; //channel of the television
    private int volume; // volume of the television

    Television(String brand, int size) {

        this.MANUFACTURER = brand;
        this.SCREEN_SIZE = size;

        this.powerON = false;
        this.volume = 20;
        this.channel = 2;

    }

    public int getVolume() {
        return this.volume;
    }

    public int getChannel() {
        return this.channel;
    }

    public String getManufacturer() {
        return this.MANUFACTURER;
    }

    public int getScreenSize() {
        return this.SCREEN_SIZE;
    }

    public void setChannel(int channelNew) {
        this.channel = channelNew;
    }

    public void power() {
        powerON = !powerON;


    }

    public void increaseVolume() {
        this.volume += 1;
    }

    public void decreaseVolume() {
        this.volume -= 1;
    }
}