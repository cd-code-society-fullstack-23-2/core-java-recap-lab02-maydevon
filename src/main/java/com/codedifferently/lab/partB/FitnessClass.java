package com.codedifferently.lab.partB;

public class FitnessClass {
    private String className;
    private Trainer trainer;
    private String schedule;
    private FitnessCategory category;

    public FitnessClass(String className, Trainer trainer, String schedule, FitnessCategory category) {
        this.className = className;
        this.trainer = trainer;
        this.schedule = schedule;
        this.category = category;
    }

    public String getSchedule() { return schedule; }
    public void setSchedule(String schedule) { this.schedule = schedule; }

    @Override
    public String toString() {
        return "ClassName: " + className + ", Trainer: " + trainer.getName() + ", Schedule: " + schedule + ", Category: " + category;
    }
}

