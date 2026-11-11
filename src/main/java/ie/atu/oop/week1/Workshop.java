package ie.atu.oop.week1;

import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class Workshop {
    private String WorkshopName;
    private int Capacity;
    private Set<String> studentID = new HashSet<>();
    private  int capCounter = 1, acceptedRegistration = 0 , rejectedRegistration = 0;

    public Workshop(String WorkshopName, int Capacity)
    {
        this.WorkshopName = WorkshopName;
        this.Capacity = Capacity;
        this.studentID = new HashSet<>();

        //this.attemptCounter = attemptCounter;

    }
    public  String getWorkshopName()
    {return WorkshopName;}

    public  int getCapacity()
    {return Capacity;}

    public  Set<String> getStudentID()
    {return studentID;}

    public int getAcceptedRegistration()
    {return acceptedRegistration;}

    public int getRejectedRegistration()
    {return rejectedRegistration;}

    public int remainingPlaces()
    {return Capacity-acceptedRegistration;}

    public  void addStudentID(String userInput)
    {
        if (capCounter > Capacity ) {
            System.out.println("Capacity exceeded");
        }

        else if(userInput == null || userInput.isEmpty())
        {
            System.out.println("Input is null or empty");
            rejectedRegistration++;
        }

        else if(studentID.contains(userInput))
        {
            System.out.println("student ID already registered");
            rejectedRegistration++;
        }
        else {
            studentID.add(userInput);
            System.out.println("Registered");
            acceptedRegistration++;
            capCounter++;
        }

    }



}

