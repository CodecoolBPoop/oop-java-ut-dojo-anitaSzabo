package com.codecool;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhraseReverseTest {


    @Test
    public void testReverseIfInputIsOneWord() {
        assertEquals("loocedoc", PhraseReverse.reverse("codecool"));
    }



    @Test
    public void testReverseIfInputIsAnEmptyStringThrowsException() {
        assertThrows(IllegalArgumentException.class, ()-> {
            PhraseReverse.reverse("");
        });

    }

    @Test
    public void testReverseWordOrderIfInputIsOneWord() {
        assertEquals("codecool", PhraseReverse.reverseWordOrder("codecool"));
    }


    @Test
    public void testReverseWordOrderIfInputIsEmptyString() {
        assertEquals("", PhraseReverse.reverseWordOrder(""));

    }

}