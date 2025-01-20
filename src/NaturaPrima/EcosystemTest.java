package NaturaPrima;

/**
 * author: Carl Palad
 * date: 19/01/2025
 * Test cases for EcoSystem class
 */

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EcosystemTest {
    
    @Test
    void testGetFinalCarnivoreScore() {
        // Arrange
        Ecosystem ecosystem = new Ecosystem();
        ArrayList<Treatment> selectedTreatments = new ArrayList<>();
        ecosystem = new Ecosystem();
        selectedTreatments.add(new Treatment("Herbivore Treatment", 500, "Treatment for herbivores", 100, 80, 90, 70, 60, 50, 40));
        selectedTreatments.add(new Treatment("Carnivore Treatment", 600, "Treatment for carnivores", 80, 100, 90, 70, 60, 50, 40));
        selectedTreatments.add(new Treatment("Omnivore Treatment", 700, "Treatment for omnivores", 90, 80, 100, 70, 60, 50, 40));
        ecosystem.setSelectedTreatments(selectedTreatments);

        // Act
        int finalCarnivoreScore = ecosystem.getFinalCarnivoreScore();

        // Assert
        Assertions.assertEquals(260, finalCarnivoreScore);
    }

    @Test
    void testGetFinalEcoTourismScore() {
        // Arrange
        Ecosystem ecosystem;
        ArrayList<Treatment> selectedTreatments = new ArrayList<>();
        ecosystem = new Ecosystem();
        selectedTreatments.add(new Treatment("Herbivore Treatment", 500, "Treatment for herbivores", 100, 80, 90, 70, 60, 50, 40));
        selectedTreatments.add(new Treatment("Carnivore Treatment", 600, "Treatment for carnivores", 80, 100, 90, 70, 60, 50, 40));
        selectedTreatments.add(new Treatment("Omnivore Treatment", 700, "Treatment for omnivores", 90, 80, 100, 70, 60, 50, 40));
        ecosystem.setSelectedTreatments(selectedTreatments);

        // Act
        int finalEcoTourismScore = ecosystem.getFinalEcoTourismScore();

        // Assert
        Assertions.assertEquals(120, finalEcoTourismScore);
    }

    @Test
    void testGetFinalHerbivoreScore() {
        // Arrange
        Ecosystem ecosystem;
        ArrayList<Treatment> selectedTreatments = new ArrayList<>();
        ecosystem = new Ecosystem();
        selectedTreatments.add(new Treatment("Herbivore Treatment", 500, "Treatment for herbivores", 100, 80, 90, 70, 60, 50, 40));
        selectedTreatments.add(new Treatment("Carnivore Treatment", 600, "Treatment for carnivores", 80, 100, 90, 70, 60, 50, 40));
        selectedTreatments.add(new Treatment("Omnivore Treatment", 700, "Treatment for omnivores", 90, 80, 100, 70, 60, 50, 40));
        ecosystem.setSelectedTreatments(selectedTreatments);

        // Act
        int finalHerbivoreScore = ecosystem.getFinalHerbivoreScore();

        // Assert
        Assertions.assertEquals(270, finalHerbivoreScore);
    }

    @Test
    void testGetFinalOmnivoreScore() {
        // Arrange
        Ecosystem ecosystem;
        ArrayList<Treatment> selectedTreatments = new ArrayList<>();
        ecosystem = new Ecosystem();
        selectedTreatments.add(new Treatment("Herbivore Treatment", 500, "Treatment for herbivores", 100, 80, 90, 70, 60, 50, 40));
        selectedTreatments.add(new Treatment("Carnivore Treatment", 600, "Treatment for carnivores", 80, 100, 90, 70, 60, 50, 40));
        selectedTreatments.add(new Treatment("Omnivore Treatment", 700, "Treatment for omnivores", 90, 80, 100, 70, 60, 50, 40));
        ecosystem.setSelectedTreatments(selectedTreatments);

        // Act
        int finalOmnivoreScore = ecosystem.getFinalOmnivoreScore();

        // Assert
        Assertions.assertEquals(280, finalOmnivoreScore);
    }

    @Test
    void testGetFinalPlantScore() {
        // Arrange
        Ecosystem ecosystem;
        ArrayList<Treatment> selectedTreatments = new ArrayList<>();
        ecosystem = new Ecosystem();
        selectedTreatments.add(new Treatment("Herbivore Treatment", 500, "Treatment for herbivores", 100, 80, 90, 70, 60, 50, 40));
        selectedTreatments.add(new Treatment("Carnivore Treatment", 600, "Treatment for carnivores", 80, 100, 90, 70, 60, 50, 40));
        selectedTreatments.add(new Treatment("Omnivore Treatment", 700, "Treatment for omnivores", 90, 80, 100, 70, 60, 50, 40));
        ecosystem.setSelectedTreatments(selectedTreatments);

        // Act
        int finalPlantScore = ecosystem.getFinalPlantScore();

        // Assert
        Assertions.assertEquals(210, finalPlantScore);
    }

    @Test
    void testGetFinalPollinatorScore() {
        // Arrange
        Ecosystem ecosystem;
        ArrayList<Treatment> selectedTreatments = new ArrayList<>();
        ecosystem = new Ecosystem();
        selectedTreatments.add(new Treatment("Herbivore Treatment", 500, "Treatment for herbivores", 100, 80, 90, 70, 60, 50, 40));
        selectedTreatments.add(new Treatment("Carnivore Treatment", 600, "Treatment for carnivores", 80, 100, 90, 70, 60, 50, 40));
        selectedTreatments.add(new Treatment("Omnivore Treatment", 700, "Treatment for omnivores", 90, 80, 100, 70, 60, 50, 40));
        ecosystem.setSelectedTreatments(selectedTreatments);

        // Act
        int finalPollinatorScore = ecosystem.getFinalPollinatorScore();

        // Assert
        Assertions.assertEquals(180, finalPollinatorScore);
    }

    @Test
    void testGetFinalSoilHealthScore() {
        // Arrange
        Ecosystem ecosystem;
        ArrayList<Treatment> selectedTreatments = new ArrayList<>();
        ecosystem = new Ecosystem();
        selectedTreatments.add(new Treatment("Herbivore Treatment", 500, "Treatment for herbivores", 100, 80, 90, 70, 60, 50, 40));
        selectedTreatments.add(new Treatment("Carnivore Treatment", 600, "Treatment for carnivores", 80, 100, 90, 70, 60, 50, 40));
        selectedTreatments.add(new Treatment("Omnivore Treatment", 700, "Treatment for omnivores", 90, 80, 100, 70, 60, 50, 40));
        ecosystem.setSelectedTreatments(selectedTreatments);

        // Act
        int finalSoilHealthScore = ecosystem.getFinalSoilHealthScore();

        // Assert
        Assertions.assertEquals(150, finalSoilHealthScore);
    }

    @Test
    void testGetStatus() {
        // Arrange
        Ecosystem ecosystem;
        ArrayList<Treatment> selectedTreatments = new ArrayList<>();
        ecosystem = new Ecosystem();
        selectedTreatments.add(new Treatment("Herbivore Treatment", 500, "Treatment for herbivores", 100, 80, 90, 70, 60, 50, 40));
        selectedTreatments.add(new Treatment("Carnivore Treatment", 600, "Treatment for carnivores", 80, 100, 90, 70, 60, 50, 40));
        selectedTreatments.add(new Treatment("Omnivore Treatment", 700, "Treatment for omnivores", 90, 80, 100, 70, 60, 50, 40));
        ecosystem.setSelectedTreatments(selectedTreatments);

        // Act
        String status = ecosystem.getStatus(
            ecosystem.getFinalHerbivoreScore(),
            ecosystem.getFinalCarnivoreScore(),
            ecosystem.getFinalOmnivoreScore(),
            ecosystem.getFinalPlantScore(),
            ecosystem.getFinalPollinatorScore(),
            ecosystem.getFinalSoilHealthScore(),
            ecosystem.getFinalEcoTourismScore()
        );

        // Assert
        Assertions.assertEquals(Ecosystem.ANSI_RED + "struggling" + Ecosystem.ANSI_RESET, status);
    }

    @Test
    void testSetSelectedTreatments() {
        // Arrange
        Ecosystem ecosystem = new Ecosystem();
        ArrayList<Treatment> newTreatments = new ArrayList<>();
        newTreatments.add(new Treatment("New Treatment", 800, "New treatment description", 50, 60, 70, 80, 90, 100, 110));

        // Act
        ecosystem.setSelectedTreatments(newTreatments);

        // Assert

        Assertions.assertEquals(newTreatments, ecosystem.getSelectedTreatments());
    }
}
