import java.util.Arrays;

public class parkingLootK {


    int parkingLootCapacity;

    String vehicleModelList[];
    String vehiclePlateList[];
    String carSizeList[];
    int ParkingHourList[];
    boolean PaymentStatusList[];
    int parkingLootList[];
    float chargePerHour;
    parkingLootK(String name, int size, float perHour){

        parkingLootCapacity = size;
        chargePerHour = perHour;

        vehicleModelList = new String[parkingLootCapacity];
        vehiclePlateList = new String[parkingLootCapacity];
        carSizeList = new String[parkingLootCapacity];
        ParkingHourList = new int[parkingLootCapacity];
        PaymentStatusList = new boolean[parkingLootCapacity];




    }

    String carPlateNumber;
    String carSize;
    String modelName;
    int totalParkingHour;

    boolean paymentStatus;
    int parkingLootNumber;




    public void addVehicle(int parkingLootNumber , String modelName,String carPlateNumber, String carSize, int totalParkingHour){

        if(parkingLootCapacity <= totalVehicleInTheParkingLoot()){
            System.out.println("All the parking loots are full we can't add the vehicle with a plate number"+carPlateNumber);
        }
        else {
            vehicleModelList[parkingLootNumber] = modelName;
            vehiclePlateList[parkingLootNumber] = carPlateNumber;
            carSizeList[parkingLootNumber] = carSize;
            ParkingHourList[parkingLootNumber] = totalParkingHour;

            System.out.println("Successfully added the vehicle with the plat number of "+carPlateNumber);
        }

    }

    public void vehicleInfo(int parkingLootNumber){
        System.out.println("the model of the vehicle is "+vehicleModelList[parkingLootNumber]);
        System.out.println("the plate Number of the vehicle is "+vehiclePlateList[parkingLootNumber]);
        System.out.println("the size of  the vehicle is "+carSizeList[parkingLootNumber]);
    }

    public float vehicleParkingCost(int parkingLootNumber){
        float payment = chargePerHour*ParkingHourList[parkingLootNumber];

        return payment;
    }

    public void vehicleRemove(int parkingLootNumber){

        vehiclePlateList[parkingLootNumber] = null;



        System.out.println("The vehicle on parking loot number " + parkingLootNumber + " is discharged.");

    }

    public void vehicleList(){

        System.out.println("The list of car's Plate No. that are currently parked on the loot are " + Arrays.toString(vehiclePlateList));


    }
    public int freeParkingLoot(){

//        int currentSpace = 0;
//
//for (int i = 0; i < parkingLootList.length; i++) {
//
//
//            if (parkingLootCapacity > parkingLootList){
//
//            currentSpace = parkingLootCapacity - parkingLootList;
//
//            return System.out.println(currentSpace);}
//
//            else
        return 0;

    }

    public  int totalVehicleInTheParkingLoot(){
        int count = 0;
        for (String i:vehiclePlateList) {

            if (i!=null){
                count++;
            }

        }
        return count;
    }


}
