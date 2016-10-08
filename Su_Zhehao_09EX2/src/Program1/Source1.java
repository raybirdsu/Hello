/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program1;

import java.util.Scanner;

/**
 *
 * @author Richard
 */
public class Source1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int floor;
        int room;
        int totalRoom = 0;
        int occupied;
        int totalOccupied = 0;
        int vacant;
        double rate;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("How many floors does the hotel have? ");
        floor = keyboard.nextInt();
        
        while (floor < 1 )
        {
            System.out.print("Invalid. Enter 1 or more: ");
            floor = keyboard.nextInt();
        }
        
        for (int flr = 1; flr <= floor; flr++)
        {
            System.out.print("How many rooms does floor " + flr + " have? ");
            room = keyboard.nextInt();
            
            while (room < 10)
            {
                System.out.print("Invalid. Enter 10 or more: ");
                room = keyboard.nextInt();
            }
            
            System.out.print("How many occupied rooms does floor " + flr +
                    " have? ");
            occupied = keyboard.nextInt();
            
            while (occupied < 0 || occupied > room)
            {
                System.out.print("Invalid. Enter again: ");
                occupied = keyboard.nextInt();
            }
            
            totalRoom += room;
            totalOccupied += occupied;
        }
        
        vacant = totalRoom - totalOccupied;
        rate = (double)totalOccupied / totalRoom;
        
        System.out.println("Number of rooms: " + totalRoom);
        System.out.println("Occupied rooms: " + totalOccupied);
        System.out.println("Vacant rooms: " + vacant);
        System.out.println("Occupancy rate: " + rate);
    }
    
}
