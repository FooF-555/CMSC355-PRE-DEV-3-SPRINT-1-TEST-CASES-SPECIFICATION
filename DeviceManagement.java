import java.util.*;

public class DeviceManagement {
    private ArrayList<IoTDevice> deviceList;

    // Device Functions
    public void createDeviceList() {
        deviceList = new ArrayList<>();
    }

    public void addDevice(IoTDevice newDevice) {
        deviceList.add(newDevice);
    }

    public void removeDevice(IoTDevice inputDevice) {
        deviceList.remove(inputDevice);
    }

    public static void displayMenu() {
        System.out.println("/////// Welcome to the IoT Device Management Page!" +
        "// Please select one of the options (1-4) below: " +
        "1) Add Device\n" +
        "2) Remove Device\n" +
        "3) Set Device\n" +
        "4) Cancel\n");
    }

    public void displayDeviceList() {
        System.out.println("/////// Devices: ");
        for (int i = 1; i < deviceList.size() + 1; i++) {
            System.out.println("- ");
            System.out.print(deviceList.get(i).getDeviceName());
        }
    }


    public void initiateDeviceManager() {
        Scanner input = new Scanner(System.in);

        displayMenu();
        
        int userChoice = Integer.parseInt(input.nextLine());

        int terminated = 0;

        while (terminated != 1) {
            switch (userChoice) {
                case 1:
                    System.out.println("Please input the name of your IoT Device: ");
                    String givenDeviceName = input.nextLine();

                    System.out.println("Please input the manufacturer of your IoT Device: ");
                    String givenManufacturer = input.nextLine();

                    int randomID = (int)(Math.random() * ((50000 - 10000) + 1)) + 10000;
                    int randomModelNum = (int)(Math.random() * ((9999999 - 1000000) + 1)) + 1000000;

                    IotDevice newDevice = new IoTDevice(randomID, givenDeviceName, givenManufacturer, randomModelNum, "Active", 0.1);
                    deviceList.add(new IoTDevice(randomID, givenDeviceName, givenManufacturer, randomModelNum, "Active", 0.1));

                case 2:
                    displayDeviceList();
                    System.out.println("What device would you like to remove? (select number): ");
                    int deviceChoice = Integer.parseInt(input.nextLine());
                    deviceList.remove(deviceChoice);
                case 3:
                case 4:
                    System.out.println("Goodbye!");
                    terminated = 1;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
