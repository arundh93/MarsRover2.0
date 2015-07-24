package com.rover;

public class Rover {
    private int xPosition;
    private int yPosition;
    private Character orientation;

    public Rover(int xPosition, int yPosition, Character orientation) {

        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.orientation = orientation;
    }

    public void moveForward() {
        if (this.orientation == 'N')
            this.yPosition++;
        if (this.orientation == 'E')
            this.xPosition++;
        if (this.orientation == 'W')
            this.xPosition--;
        if (this.orientation == 'S')
            this.yPosition--;
    }

    @Override
    public boolean equals(Object thatRover) {
        if (this == thatRover) return true;
        if (thatRover == null || getClass() != thatRover.getClass()) return false;

        Rover that = (Rover) thatRover;

        if (xPosition != that.xPosition) return false;
        if (yPosition != that.yPosition) return false;
        return !(orientation != null ? !orientation.equals(that.orientation) : that.orientation != null);

    }

    @Override
    public int hashCode() {
        int result = xPosition;
        result = 31 * result + yPosition;
        result = 31 * result + (orientation != null ? orientation.hashCode() : 0);
        return result;
    }

    public void changeOrientation(char command) {
        switch (this.orientation) {

            case 'N':
                if (command == 'L')
                    this.orientation = 'W';
                if (command == 'R')
                    this.orientation = 'E';
                break;

            case 'S':
                if (command == 'L')
                    this.orientation = 'E';
                if (command == 'R')
                    this.orientation = 'W';
                break;

            case 'E':
                if (command == 'L')
                    this.orientation = 'S';
                if (command == 'R')
                    this.orientation = 'N';
                break;

            case 'W':
                if (command == 'L')
                    this.orientation = 'N';
                if (command == 'R')
                    this.orientation = 'S';
                break;
        }
    }
}
