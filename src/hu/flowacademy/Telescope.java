package hu.flowacademy;

public abstract class Telescope {

    float diameter;
    int fLength;

    public Telescope(float diameter, int fLength) {
     //   if (this.diameter < 0) throw Exception("diameter should be positive");
        this.diameter = diameter;
    //    if (this.fLength < 0) throw new Exception("fLength should be positive")
        this.fLength = fLength;
    }

    public float getDiameter() {
        return diameter;
    }

    public void setDiameter(float diameter) {
        this.diameter = diameter;
    }

    public int getfLength() {
        return fLength;
    }

    public void setfLength(int fLength) {
        this.fLength = fLength;
    }

    @Override
    public String toString() {
        return "Telescope:" +
                "diameter=" + diameter +
                ", fLength=" + fLength;
    }

    public abstract boolean hasColorError();
}
