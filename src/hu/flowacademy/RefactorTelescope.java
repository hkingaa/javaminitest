package hu.flowacademy;

public final class RefactorTelescope extends Telescope {

    int numberOfLenses;

    public RefactorTelescope(float diameter, int fLength, int numberOfLenses) {
        super(diameter, fLength);
        this.numberOfLenses = numberOfLenses;
    }

    @Override
    public boolean hasColorError() {
        return true;
    }

    public int getNumberOfLenses() {
        return numberOfLenses;
    }

    public void setNumberOfLenses(int numberOfLenses) {
        this.numberOfLenses = numberOfLenses;
    }

    @Override
    public String toString() {
        return super.toString() + " numberOfLenses: " + numberOfLenses;
    }
}
