package ie.atu.oop.week1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int counter = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Workshop Name: ");
        String WorkshopName = sc.next();
        System.out.println("Capacity: ");
        int capacity = sc.nextInt();
        sc.nextLine();
        System.out.println("How many attempts: ");
        int attempts = sc.nextInt();
        sc.nextLine();
        Workshop workshop = new Workshop(WorkshopName,capacity);

        System.out.println("workshop Name: "+ workshop.getWorkshopName());
        System.out.println("Capacity: "+workshop.getCapacity());

        while (counter <= attempts  )
        {

                System.out.println("enter student ID");
                String UserInput = sc.nextLine();
                workshop.addStudentID(UserInput);


            counter++;
        }

        System.out.println("registered student IDs: "+ workshop.getStudentID());
        System.out.println("total accepted registrations: " + workshop.getAcceptedRegistration());
        System.out.println("total rejected registrations: " + workshop.getRejectedRegistration());
        System.out.println("remaining places: " + workshop.remainingPlaces() );

    }

}