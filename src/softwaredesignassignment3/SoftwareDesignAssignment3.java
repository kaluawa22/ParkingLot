    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */
    package softwaredesignassignment3;
    import java.util.*;
    import java.lang.Math;
    import java.sql.Timestamp;
    import java.util.LinkedList;
    import java.util.Random;
    import java.util.Scanner;
    import java.io.File;
    import java.io.FileNotFoundException;
    import java.io.*;
    /**
     *
     * @author kaluawa
     */






public class SoftwareDesignAssignment3 {
    
//     public static void readFile (String[] args) throws IOException{
//        
//        
//
//    }
        public static void main(String[] args) throws IOException{
        
        //List<String> lines = new ArrayList<String>();
        
        //final Scanner fileInput = new Scanner(new File ("src/main/resources/input.txt"));
        //while(fileInput.hasNext()){
//            final String nextLine = fileInput.nextLine();
//        }
        BufferedReader in = new BufferedReader(new FileReader("/Users/kaluawa/Desktop/tests/input.txt"));
        String str=null;
        ArrayList<String> lines = new ArrayList<String>();
        while((str = in.readLine()) != null){
            lines.add(str);
        }
        String[] linesArray = lines.toArray(new String[lines.size()]);
        
        int parkingLot1Capacity = Integer.valueOf(linesArray[0]);
        int parkingLot2Capacity = Integer.valueOf(linesArray[1]);
        int parkingLot3Capacity = Integer.valueOf(linesArray[2]);
        
        System.out.println("There are 3 Avaiable parking lots to choose from!");
        System.out.println("Parking Lot 1 has has " + parkingLot1Capacity + "spaces" );
        System.out.println("Parking Lot 2 has has " + parkingLot2Capacity + "spaces" );
        System.out.println("Parking Lot 3 has has " + parkingLot3Capacity + "spaces" );
        
//        System.out.println("This is the parkingLot Capacity :" + parkingLotCapacity);
        
        ParkingLot Lot1 = new ParkingLot(parkingLot1Capacity);
        ParkingLot Lot2 = new ParkingLot(parkingLot2Capacity);
        ParkingLot Lot3 = new ParkingLot(parkingLot3Capacity);
        
        
//        System.out.println("The Capacity of the parking lot is = " + Lot1.getCapacity());
        System.out.println("Lets try to park some cars!");
        System.out.println("The first car to park is :" + linesArray[3] + "in Lot 1");
        Lot1.parkACar(linesArray[3]);
        System.out.println("The current amount of spots taken in Parking Lot 1 is "+ Lot1.getCapacity());
        
        System.out.println("The next car to park is :" + linesArray[4] + "in Lot 2");
        Lot2.parkACar(linesArray[4]);
        System.out.println("The current amount of spots taken in Parking Lot 2 is "+ Lot2.getCapacity());
        
        
        System.out.println("The next car to park is :" + linesArray[5] + "in Lot 3");
        Lot3.parkACar(linesArray[5]);
        System.out.println("The current amount of spots taken in Parking Lot 3 is "+ Lot3.getCapacity());
        
        
        System.out.println("The next car to park is :" + linesArray[3] + "in Lot 1");
        Lot1.parkACar(linesArray[3]);
        System.out.println("The current amount of spots taken in Parking Lot 1 is "+ Lot1.getCapacity());
        
        System.out.println("The next car to park is :" + linesArray[4] + "in Lot 2");
        Lot2.parkACar(linesArray[4]);
        System.out.println("The current amount of spots taken in Parking Lot 2 is "+ Lot2.getCapacity());
        
        
        System.out.println("The next car to park is :" + linesArray[5] + "in Lot 3");
        Lot3.parkACar(linesArray[5]);
        System.out.println("The current amount of spots taken in Parking Lot 3 is "+ Lot3.getCapacity());
        
        
        System.out.println("The next car to park is :" + linesArray[3] + "in Lot 1");
        Lot1.parkACar(linesArray[3]);
        System.out.println("The current amount of spots taken in Parking Lot 1 is "+ Lot1.getCapacity());
        
        System.out.println("The next car to park is :" + linesArray[4] + "in Lot 2");
        Lot2.parkACar(linesArray[4]);
        System.out.println("The current amount of spots taken in Parking Lot 2 is "+ Lot2.getCapacity());
        
        
        System.out.println("The next car to park is :" + linesArray[5] + "in Lot 3");
        Lot3.parkACar(linesArray[5]);
        System.out.println("The current amount of spots taken in Parking Lot 3 is "+ Lot3.getCapacity());

        
        
        
        
        
        
        Lot1.parkACar(linesArray[1]);
        System.out.println("Lets try to park another car!");
        System.out.println("The next car to park is :" + linesArray[2]);
        Lot1.parkACar(linesArray[2]);
        System.out.println("Lets try to park another car!");
        System.out.println("The next car to park is :" + linesArray[3]);
        Lot1.parkACar(linesArray[3]);
        System.out.println("Lets try to park another car!");
        System.out.println("The next car to park is :" + linesArray[4]);
        Lot1.parkACar(linesArray[4]);
        
//        Scanner xp = new Scanner(System.in);
//        System.out.println("Capacity of parking lot = "+ test.getCapacity());
//        
//        System.out.println("\nLets try to park! Enter your Name:");
//        test.parkACar(xp.nextLine());
//        
//        System.out.println("\nLets try to park! Enter your Name:");
//        test.parkACar(xp.nextLine());
//        
//        System.out.println("\nLets try to park! Enter your Name:");
//        test.parkACar(xp.nextLine());
//        
//        System.out.println("\nThe number of cars parked at this moment : "+ test.getSize());
//        
//        System.out.println("\nLets try to park! Enter your Name:");
//        test.parkACar(xp.nextLine());
//        
        
      
        Random rand = new Random();
        
        int index = rand.nextInt(Lot1.getSize() +1);
        CarParkInfo pc = Lot1.getCars().get(index);
        System.out.println("\nThis Car is Trying to leave the parking lot.");
        Lot1.leaveFromParking(pc);
        
        System.out.println("\nThe number of cars parked at this moment : "+ Lot1.getSize());
        
        index = rand.nextInt(Lot1.getSize() + 1);
        pc = Lot1.getCars().get(index);
        System.out.println("\nA car is trying to leave.");
        Lot1.leaveFromParking(pc);

        System.out.println("\nThe number of cars parked right now is : "+ Lot1.getSize());

//        //should not allow to enter parking
//        System.out.println("\nLets Try to Park! What is your name:");
//        test.parkACar(xp.nextLine());  

        System.out.println("\nThe number of cars parked right now is : "+ Lot1.getSize());

//        xp.close();
//        
         
    }
    public static class ParkingLot {
        private String name;
        private int capacity = 0; //maximum capacity of parking lot
        private int size = 0; //number of currently parked cars
        private LinkedList<CarParkInfo> cars = null;
        public ParkingLot(int capacity){
           this.capacity = capacity;
           this.cars = new LinkedList<CarParkInfo>();
           this.size = 0;
        }

        public LinkedList<CarParkInfo> getCars() {
           return cars;
        }
        public int getSize() {
           return size;
        }


       

        public int getCapacity() {
           return capacity;
        }

        public void parkACar(String name){
          if(this.size == this.capacity) { 
              System.out.println("Sorry the Parking Lot is Full.");
          }
          else { 
              CarParkInfo parkingCar = new CarParkInfo(name); 
              cars.add(parkingCar); //add it to cars
              System.out.println("A new car has been parked. Here is the information: "+ parkingCar);
              
              this.size++; 
              
           }
        }

        public void leaveFromParking(CarParkInfo pc){
           boolean isLeft = cars.remove(pc); 
           if(isLeft){ 
               this.size--;
               System.out.println("The car having "+ pc +" has left the parking lot.");
           }
           else{
               System.out.println("No Parking Info Found!");
           }
        }

    }

    public static class CarParkInfo {
        private String name;
        private Timestamp timestamp;


        public CarParkInfo(String name) {
            this.name = name;
            this.timestamp = new Timestamp(System.currentTimeMillis());
        }

        public String toString() {
           return "ParkingCarInfo [name=" + name + ", timestamp=" + timestamp + "]";
        }
        public boolean equals(Object obj) {
            if(obj == null){
                return false;
            }else{
                CarParkInfo other = (CarParkInfo) obj;
                if(this.name.equals(other.name) && this.timestamp.equals(other.timestamp)){
                    return true;
                }
                else {
                    return false;
                }
            }
        }




    }
    




}