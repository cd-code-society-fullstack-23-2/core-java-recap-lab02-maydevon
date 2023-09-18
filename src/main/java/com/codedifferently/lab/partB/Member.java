package com.codedifferently.lab.partB;

public class Member extends Person {
    private static int memberCount = 0;
    private int id;
    private MembershipType membershipType;
    private String workoutPlan;

    public Member(String name, int age, MembershipType membershipType) {
        super(name, age);
        this.membershipType = membershipType;
        this.id = ++memberCount;
    }

    public int getId() { return id; }
    public MembershipType getMembershipType() { return membershipType; }
    public void setMembershipType(MembershipType membershipType) { this.membershipType = membershipType; }

    public void updateWorkoutPlan(String workoutPlan) { this.workoutPlan = workoutPlan; }

    @Override
    public String toString() {
        return super.toString() + ", ID: " + id + ", MembershipType: " + membershipType;
    }
}

