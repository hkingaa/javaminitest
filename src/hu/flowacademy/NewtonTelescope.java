package hu.flowacademy;

public final class NewtonTelescope extends Telescope {

    float secondMirrorSize;

    public NewtonTelescope(float diameter, int fLength, float secondMirrorSize) {
        super(diameter, fLength);
        this.secondMirrorSize = secondMirrorSize;
    }


    @Override
    public boolean hasColorError() {
        return false;
    }

    public float getSecondMirrorSize() {
        return secondMirrorSize;
    }

    public void setSecondMirrorSize(float secondMirrorSize) {
        this.secondMirrorSize = secondMirrorSize;
    }

    @Override
    public String toString() {
        return super.toString() + " secondMirrorsize: " + secondMirrorSize;
    }
}
