package com.rover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoverDriverTest {

    @Test
    public void canCreateARover() {
        RoverDriver roverDriver = new RoverDriver();

        assertEquals(true, roverDriver.createRover());
    }
}
