package com.kp.elevator;

import java.util.ArrayList;
import java.util.List;

public class ElevatorUsers {

    private Elevator eLevator;

    private List<Elevator> elevators = new ArrayList<Elevator>();

    public void authorizeUser() {

    }

    public void callElevatorforUpStairs() {

    }

    public void callElevatorforDownStairs() {

    }

    public void checkingCurrentStatusofElevator() {

    }

    public void getWaitTime() {

    }

    public void openTheDoors() {

    }

    public void closedTheDoors() {

    }

    public void allowedFloors() {

    }

    public int callTheElevator(int floorNo) {
        AutomaticElevtorSlection automaticElevtorSlection = new AutomaticElevtorSlection(elevators, floorNo);
        eLevator = automaticElevtorSlection.getAutomaticSelectedElevator();
        int floorCount = eLevator.getfloorCount();
        // AutomaticElevtorSlection
        // int elvID = eLevator.getElevatorId();

        if (floorNo >= 1 && floorNo <= floorCount) {

            System.out.println("calling elevator at" + floorNo);
            System.out.println("wait time..");

        }
        return floorNo;
    }
}
