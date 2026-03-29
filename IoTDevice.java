import java.util.*;

public class IoTDevice {

    // Device fields
    private final int deviceID;
    private String deviceName;
    private final String manufacturer;
    private final int modelNumber;
    private String status;
    private double firmwareVersion;

    // Constructor
    public IoTDevice(int deviceID, String deviceName, String manufacturer, int modelNumber, String status, double firmwareVersion) {
        this.deviceID = deviceID;
        this.deviceName = deviceName;
        this.manufacturer = manufacturer;
        this.modelNumber = modelNumber;
        this.status = status;
        this.firmwareVersion = firmwareVersion;
    }

    // Getter Methods
    public int getDeviceID() {
        return deviceID;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getModelNumber() {
        return modelNumber;
    }

    public String getStatus() {
        return status;
    }

    public double getVersion() {
        return firmwareVersion;
    }

    // Setter Methods
    public void setName(String newName) {
        deviceName = newName;
    }

    public void setStatus(String newStatus) {
        status = newStatus;
    }

    public void setVersion(float newVersion) {
        firmwareVersion = newVersion;
    }


    // Get Device Details
    public void getDeviceDetails() {
        System.out.println("//// Details of Device: " + deviceName +
        "- ID: " + deviceID +
        "- Manufacturer: " + manufacturer +
        "- Model Number: " + modelNumber +
        "- Current Status: " + status +
        "- Firmware Version: " + firmwareVersion);
    }
}
