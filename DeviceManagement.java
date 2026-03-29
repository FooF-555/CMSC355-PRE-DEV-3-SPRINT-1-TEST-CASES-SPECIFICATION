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

    // For setting a device's attributes
    public void setName(String newName) {
        
    }

    public void displayMenu() {
        System.out.println("/////// Welcome to the IoT Device Management Page!" +
        "// Please select one of the options (1-4) below: " +
        "1) Add Device\n" +
        "2) Remove Device\n" +
        "3) Set Device\n" +
        "4) Cancel\n");
    }
}
