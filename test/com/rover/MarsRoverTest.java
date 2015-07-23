package com.rover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MarsRoverTest {

    @Test
    public void movesTo10From00ForMoveComandWhenOrientationIsNorth() {
        Rover actual = new Rover(0, 0, 'N');
        Rover expected = new Rover(0, 1, 'N');

        actual.moveForward();

        assertEquals(expected, actual);
    }
}