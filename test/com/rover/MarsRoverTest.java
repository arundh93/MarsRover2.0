package com.rover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MarsRoverTest {

    @Test
    public void movesTo01From00ForMoveCommandWhenOrientationIsNorth() {
        Rover actual = new Rover(0, 0, 'N');
        Rover expected = new Rover(0, 1, 'N');

        actual.moveForward();

        assertEquals(expected, actual);
    }

    @Test
    public void movesTo10From00ForMoveCommandWhenOrientationIsEast() {
        Rover actual = new Rover(0, 0, 'E');
        Rover expected = new Rover(1, 0, 'E');

        actual.moveForward();

        assertEquals(expected, actual);
    }

    @Test
    public void movesTo22From32ForMoveCommandWhenOrientationIsWest() {
        Rover actual = new Rover(3, 2, 'W');
        Rover expected = new Rover(2, 2, 'W');

        actual.moveForward();

        assertEquals(expected, actual);
    }

    @Test
    public void movesTo32From33ForMoveCommandWhenOrientationIsSouth() {
        Rover actual = new Rover(3, 3, 'S');
        Rover expected = new Rover(3, 2, 'S');

        actual.moveForward();

        assertEquals(expected, actual);
    }
}