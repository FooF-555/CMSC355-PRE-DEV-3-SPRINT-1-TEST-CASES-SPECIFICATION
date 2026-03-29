


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
            System.out.println(i +" - ");
            System.out.print(deviceList.get(i - 1).getDeviceName());
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
                    try {
                        System.out.println("Please input the name of your IoT Device: ");
                        String givenDeviceName = input.nextLine();

                        System.out.println("Please input the manufacturer of your IoT Device: ");
                        String givenManufacturer = input.nextLine();

                        int randomID = (int)(Math.random() * ((50000 - 10000) + 1)) + 10000;
                        int randomModelNum = (int)(Math.random() * ((9999999 - 1000000) + 1)) + 1000000;

                        deviceList.add(new IoTDevice(randomID, givenDeviceName, givenManufacturer, randomModelNum, "Active", 0.1));

                        displayDeviceList();
                        System.out.println("Device successfully added!");
                    } catch (Exception e) {
                        System.out.println("Invalid input!");
                        initiateDeviceManager();
                    }

                case 2:
                    displayDeviceList();
                    System.out.println("What device would you like to remove? (select number): ");
                    int removalChoice = Integer.parseInt(input.nextLine());
                    deviceList.remove(removalChoice - 1);
                case 3:
                    displayDeviceList();

                    System.out.println("Which device would you like to adjust? (select number): ");
                    int deviceChoice = Integer.parseInt(input.nextLine());

                    System.out.println("/// Settings\n" +
                    "1) Edit Name\n"); // This is the only setting for now that I can think of being adjusted


                    System.out.println("What would you like to adjust? (select number): ");
                    int settingChoice = Integer.parseInt(input.nextLine());

                    boolean finished = false;

                    while (!finished) {
                        if (settingChoice == 1 ) {
                            System.out.println("Please provide a name for this device: ");
                            String newDeviceName = input.nextLine();

                            deviceList.get(deviceChoice - 1).setName(newDeviceName);
                            System.out.println(deviceList.get(deviceChoice - 1).getDeviceName());
                            System.out.println("// The device has been renamed!");
                            finished = true;
                        }
                    }
                case 4:
                    System.out.println("Goodbye!");
                    terminated = 1;
                default:
                    System.out.println("Invalid choice!");
                    terminated = 1;
            }
        }
    }
}
