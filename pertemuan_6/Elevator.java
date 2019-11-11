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
public class Elevator {
    public boolean doorOpen=false; 
    public int currentFloor = 1; 
    public final int TOP_FLOOR = 5; 
    public final int BOTTOM_FLOOR = 1;
    
    public void openDoor() {
    System.out.println("Opening door."); 
    doorOpen = true; System.out.println("Door is open.");
}

    public void closeDoor() { 
        System.out.println("Closing door.");
        doorOpen = false; 
        System.out.println("Door is closed.");
}

public void goUp()  { 
    System.out.println("Going up one floor.");
    currentFloor++;
    System.out.println("Floor: " + currentFloor);

}

public void goDown()  { 
    System.out.println("Going down one floor.");
    currentFloor--;
    System.out.println("Floor: " + currentFloor);

}

public void setFloor(int desiredFloor) { 
    while (currentFloor != desiredFloor){
        if(currentFloor < desiredFloor) { 
            goUp();
        }
         else {
            goDown();
        }

    }
   }
public int getFloor(){ 
    return currentFloor;
}


public boolean checkDoorStatus(){ 
    return doorOpen;
}
}