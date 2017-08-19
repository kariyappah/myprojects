package com.kp.elevator;

public class Elevator {

    private ElevatorInfo elevatorInfo;

    public Elevator(ElevatorInfo elevatorInfo) {
        this.elevatorInfo = elevatorInfo;
    }

    public void setElevatorInfo(ElevatorInfo elevatorInfo) {
        this.elevatorInfo = elevatorInfo;
    }

    public String getElevatorInfo() {
        return this.elevatorInfo.getElevatorInfo();
    }

    public int getfloorCount() {
        return this.elevatorInfo.getFloorsCount();
    }
    public int getElevatorId() {
        return this.elevatorInfo.getElevatorId();
    }

    public void startElevator() {

    }

    public void stopElevator() {

    }
}
