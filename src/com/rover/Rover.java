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

    public void changeOrientation(char l) {
        switch (this.orientation) {

            case 'N':
                if (l == 'L')
                    this.orientation = 'W';
                if (l == 'R')
                    this.orientation = 'E';

                break;
            case 'S':
                if (l == 'L')
                    this.orientation = 'E';
                if (l == 'R')
                    this.orientation = 'W';

                break;
            case 'E':
                if (l == 'L')
                    this.orientation = 'S';
                if (l == 'R')
                    this.orientation = 'N';

                break;
            case 'W':
                if (l == 'L')
                    this.orientation = 'N';
                if (l == 'R')
                    this.orientation = 'S';

                break;
        }
    }
}
