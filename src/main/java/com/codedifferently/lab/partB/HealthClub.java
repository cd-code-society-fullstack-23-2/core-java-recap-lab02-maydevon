package com.codedifferently.lab.partB;

import java.util.ArrayList;

public class HealthClub {
    private ArrayList<Member> members = new ArrayList<>();
    private ArrayList<Trainer> trainers = new ArrayList<>();
    private ArrayList<FitnessClass> classes = new ArrayList<>();

    public void addMember(Member member) { members.add(member); }
    public boolean removeMember(Member member) { return members.remove(member); }

    public void addTrainer(Trainer trainer) { trainers.add(trainer); }
    public void addClass(FitnessClass fitnessClass) { classes.add(fitnessClass); }

    public Member searchMember(String name) {
        for(Member member : members) {
            if(member.getName().equals(name))
                return member;
        }
        return null;
    }

    public Trainer searchTrainer(String name) {
        for(Trainer trainer : trainers) {
            if(trainer.getName().equals(name))
                return trainer;
        }
        return null;
    }

    @Override
    public String toString() {
        return "HealthClub: \nMembers: " + members + "\nTrainers: " + trainers + "\nClasses: " + classes;
    }
}

