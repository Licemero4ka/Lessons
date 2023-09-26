package Classworks.CW4;

public class Object {
    public static void main(String[] args) {
        data_saving_device device1 =new data_saving_device ("Samsung", "M2", 2, "TB");
        data_saving_device device2 =new data_saving_device ("Kingston", "SSD", 256);
        data_saving_device device3 =new data_saving_device ("Toshiba");
        data_saving_device device4 =new data_saving_device ();
        //device1.Info();
        //Scanner in = new Scanner(System.in);
        //int numberofincrease = in.nextInt();
        //device1.IncreaseCapacity(numberofincrease);
        device1.Info();
        device2.Info();
        device3.Info();
        device4.Info();
    }
}
