/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan_6;

/**
 *
 * @author HP
 */
public class ElevatroTestTwo {
    public static void main(String[] args) { 
        Elevator myElevator = new Elevator(); 
        myElevator.openDoor(); 
        myElevator.closeDoor(); 
        myElevator.goUp();
        myElevator.goUp(); 
        myElevator.goUp(); 
        myElevator.openDoor(); 
        myElevator.closeDoor(); 
        myElevator.goDown(); 
        myElevator.openDoor();
        myElevator.closeDoor(); 
        myElevator.goDown();
        int curFloor = myElevator.getFloor(); 
        System.out.println("Current Floor: " + curFloor); 
        myElevator.setFloor(curFloor+1); 
        myElevator.openDoor();
}
}
