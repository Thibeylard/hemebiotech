import main.java.com.hemebiotech.analytics.Symptom;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SymptomTest {

    @Test
    void Given_SymptomWithOneOccurrence_When_incrementSymptomOccurrence_Then_SymptomOccurrenceIncreasedByOne() {
        Symptom s = new Symptom("symptomA", 1);
        s.addOccurrences(3);
        assertEquals(4, s.getOccurrences());
    }
}