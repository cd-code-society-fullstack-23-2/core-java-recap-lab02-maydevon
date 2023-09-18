package com.codedifferently.lab.partB;

public class Trainer extends Person {
    private static int trainerCount = 0;
    private int trainerID;
    private FitnessCategory expertise;

    public Trainer(String name, int age, FitnessCategory expertise) {
        super(name, age);
        this.expertise = expertise;
        this.trainerID = ++trainerCount;
    }

    public void assignWorkoutPlan(Member member, String workoutPlan) {
        member.updateWorkoutPlan(workoutPlan);
    }

    @Override
    public String toString() {
        return super.toString() + ", TrainerID: " + trainerID + ", Expertise: " + expertise;
    }
}

