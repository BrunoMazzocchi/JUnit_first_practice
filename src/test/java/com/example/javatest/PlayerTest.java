package com.example.javatest;

import org.junit.*;
import org.mockito.*;

import static org.junit.Assert.*;

public class PlayerTest {
    @Test
    public void lose_when_dice_number_is_to_low(){

        // Dice dice = new Dice(6);

        //Genera el mock de la clase
        Dice dice = Mockito.mock(Dice.class);
        Mockito.when(dice.roll()).thenReturn(2);
        Player player = new Player(dice, 3);

        assertEquals(false, player.play());
    }

    @Test
    public void lose_when_dice_number_is_too_big(){

        // Dice dice = new Dice(6);

        //Genera el mock de la clase
        Dice dice = Mockito.mock(Dice.class);
        Mockito.when(dice.roll()).thenReturn(5);
        Player player = new Player(dice, 3);

        assertEquals(false, player.play());
    }
}