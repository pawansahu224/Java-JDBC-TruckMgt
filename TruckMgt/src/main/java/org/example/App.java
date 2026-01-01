package org.example;

import java.util.List;

/**
 * Hello world!
 *This is the main file of the application
 *
 */
public class App 
{
    public static void main(String[] args) {

        TruckService truckService = new TruckService();
        Truck tata = new Truck("TATA","2019",1200,"rajesh");
        Truck volvo = new Truck("VOLVO","2009",1290,"Akash");
        Truck Eicher = new Truck("EICHER","2020",1900,"Harsh");

        // adding data into database
        System.out.println("Adding data.......");
        truckService.addTruck(tata);
        truckService.addTruck(volvo);
        truckService.addTruck(Eicher);

        // fetch
        System.out.println("Fetching data by id "+1);
        Truck truck = truckService.getTruckById(1);
        System.out.println("Truck data : "+truck);

        // updating truck data
        System.out.println("Updating  data.......");
        truck.setDriverName("ramesh");
        truckService.updateTruck(truck);
        System.out.println("Updated truck data :"+truckService.getTruckById(1));

        // get all truck data
        System.out.println("Getting all data.......");
        List<Truck> allTrucks = truckService.getAllTruck();
        System.out.println("All trucks in DB :");
        for(Truck truck1 : allTrucks)
        {
            System.out.println(truck1);
        }

        // delete truck data
        System.out.println("Deleting data.......");
        truckService.deleteTruck(2);
        System.out.println("Data delete by id: "+2);

        System.out.println("Getting all data.......");
        allTrucks = truckService.getAllTruck();
        System.out.println("All Trucks after all operations :");
        System.out.println(allTrucks);
    }


}
