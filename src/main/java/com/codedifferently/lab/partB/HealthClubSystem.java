package com.codedifferently.lab.partB;

public class HealthClubSystem {
    public static void main(String[] args) {
        HealthClub healthClub = new HealthClub();

        Member m1 = new Member("Alice", 25, MembershipType.PREMIUM);
        healthClub.addMember(m1);

        Trainer t1 = new Trainer("John", 30, FitnessCategory.YOGA);
        healthClub.addTrainer(t1);

        FitnessClass fClass1 = new FitnessClass("Morning Yoga", t1, "09:00 AM - 10:00 AM", FitnessCategory.YOGA);
        healthClub.addClass(fClass1);

        System.out.println(healthClub);
    }
}

