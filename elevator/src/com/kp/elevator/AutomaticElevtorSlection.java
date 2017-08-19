package com.kp.elevator;

import java.util.List;

public class AutomaticElevtorSlection {

    private Elevator selectedElevator;

    private List<Elevator> elevators;

    public AutomaticElevtorSlection(List<Elevator> elevators, int callerFloar) {

        // Collect current status of the elevator, e.g. elevatorCounts, CurrentLcoaitonofElevator,
        // StatusOfEachElevator
        List<Elevator> IdleElevator = getIdleElevator();
        selectedElevator = getMinDistance(IdleElevator, callerFloar);
    }

    private Elevator getMinDistance(List<Elevator> idleElevator, int callerFloar2) {
        // TODO Shortest Distance from the caller floor
        return null;
    }

    private List<Elevator> getIdleElevator() {
        // TODO Select specific elevator (Idle Lift, Shortest Distance from the caller floor)
        // equal value for all the lifts randomly picked one
        return null;
    }

    public Elevator getAutomaticSelectedElevator() {
        return selectedElevator;
    }
}
