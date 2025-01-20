package NaturaPrima;

/**
 * author: Carl Palad
 * date: 19/01/2025
 * Test cases for the Treatment class
 */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TreatmentTest {
    @Test
    void testGetCarnivoreScore() {
        // Arrange
        Treatment treatment;
        treatment = new Treatment("Herbivore Treatment", 500, "Treatment for herbivores", 100, 80, 90, 70, 60, 50, 40);

        // Act
        int actual = treatment.getCarnivoreScore();

        // Assert
        int expected = 80;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetCost() {
        // Arrange
        Treatment treatment;
        treatment = new Treatment("Herbivore Treatment", 500, "Treatment for herbivores", 100, 80, 90, 70, 60, 50, 40);

        // Act
        double actual = treatment.getCost();

        // Assert
        double expected = 500;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetEcoTourismScore() {
        // Arrange
        Treatment treatment;
        treatment = new Treatment("Herbivore Treatment", 500, "Treatment for herbivores", 100, 80, 90, 70, 60, 50, 40);

        // Act
        int actual = treatment.getEcoTourismScore();

        // Assert
        int expected = 40;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetHerbivoreScore() {
        // Arrange
        Treatment treatment;
        treatment = new Treatment("Herbivore Treatment", 500, "Treatment for herbivores", 100, 80, 90, 70, 60, 50, 40);

        // Act
        int actual = treatment.getHerbivoreScore();

        // Assert
        int expected = 100;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetInfo() {
        // Arrange
        Treatment treatment;
        treatment = new Treatment("Herbivore Treatment", 500, "Treatment for herbivores", 100, 80, 90, 70, 60, 50, 40);

        // Act
        String actual = treatment.getInfo();

        // Assert
        String expected = "Treatment for herbivores";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetOmnivoreScore() {
        // Arrange
        Treatment treatment;
        treatment = new Treatment("Herbivore Treatment", 500, "Treatment for herbivores", 100, 80, 90, 70, 60, 50, 40);

        // Act
        int actual = treatment.getOmnivoreScore();

        // Assert
        int expected = 90;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetPlantScore() {
        // Arrange
        Treatment treatment;
        treatment = new Treatment("Herbivore Treatment", 500, "Treatment for herbivores", 100, 80, 90, 70, 60, 50, 40);

        // Act
        int actual = treatment.getPlantScore();

        // Assert
        int expected = 70;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetPollinatorScore() {
        // Arrange
        Treatment treatment;
        treatment = new Treatment("Herbivore Treatment", 500, "Treatment for herbivores", 100, 80, 90, 70, 60, 50, 40);

        // Act
        int actual = treatment.getPollinatorScore();

        // Assert
        int expected = 60;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetSoilHealthScore() {
        // Arrange
        Treatment treatment;
        treatment = new Treatment("Herbivore Treatment", 500, "Treatment for herbivores", 100, 80, 90, 70, 60, 50, 40);

        // Act
        int actual = treatment.getSoilHealthScore();

        // Assert
        int expected = 50;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetTreatmentName() {
        // Arrange
        Treatment treatment;
        treatment = new Treatment("Herbivore Treatment", 500, "Treatment for herbivores", 100, 80, 90, 70, 60, 50, 40);

        // Act
        String actual = treatment.getTreatmentName();

        // Assert
        String expected = "Herbivore Treatment";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testToString() {
        // Arrange
        Treatment treatment;
        treatment = new Treatment("Herbivore Treatment", 500, "Treatment for herbivores", 100, 80, 90, 70, 60, 50, 40);

        // Act
        String actual = treatment.toString();

        // Assert
        String expected = "Treatment Name: Herbivore Treatment";
        Assertions.assertEquals(expected, actual);
    }
}
