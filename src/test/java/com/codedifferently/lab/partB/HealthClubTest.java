package com.codedifferently.lab.partB;

import com.codedifferently.lab.partB.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HealthClubTest {

    private HealthClub healthClub;

    @BeforeEach
    public void setUp() {
        healthClub = new HealthClub();
    }

    @Test
    public void testAddMember() {
        Member member = new Member("Alice", 25, MembershipType.PREMIUM);
        healthClub.addMember(member);
        assertEquals(member, healthClub.searchMember("Alice"));
    }

    @Test
    public void testRemoveMember() {
        Member member = new Member("Bob", 28, MembershipType.GOLD);
        healthClub.addMember(member);
        healthClub.removeMember(member);
        assertNull(healthClub.searchMember("Bob"));
    }

    @Test
    public void testAddTrainer() {
        Trainer trainer = new Trainer("Charlie", 32, FitnessCategory.STRENGTH_TRAINING);
        healthClub.addTrainer(trainer);
        assertEquals(trainer, healthClub.searchTrainer("Charlie"));
    }

    @Test
    public void testSearchMember_NotFound() {
        assertNull(healthClub.searchMember("David"));
    }

    @Test
    public void testSearchTrainer_NotFound() {
        assertNull(healthClub.searchTrainer("Eva"));
    }

    @Test
    public void testAddClass() {
        Trainer trainer = new Trainer("Frank", 34, FitnessCategory.DANCE);
        healthClub.addTrainer(trainer);
        FitnessClass fitnessClass = new FitnessClass("Evening Dance", trainer, "06:00 PM - 07:00 PM", FitnessCategory.DANCE);
        healthClub.addClass(fitnessClass);
        String healthClubRepresentation = healthClub.toString();
        assertNotNull(healthClubRepresentation);
        assertTrue(healthClubRepresentation.contains("Evening Dance"));
        assertTrue(healthClubRepresentation.contains("06:00 PM - 07:00 PM"));
    }
}

