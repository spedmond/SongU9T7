public class ThreeDPoint extends Point {
    private int z;

    public ThreeDPoint(String label, int x, int y, int z) {
        super(label,x,y);
        this.z = z;
    }

    public String toString() {
        return super.toString() + ", z = " + z;
    }

    public boolean equals(ThreeDPoint p) {
        if (!(p instanceof ThreeDPoint)) {
            return false;
        }
        return super.equals(p) && z == p.z;
    }
}
