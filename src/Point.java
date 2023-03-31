public class Point {
    private String label;
    private int x;
    private int y;

    public Point (String label, int x, int y) {
        this.label = label;
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "Point " + label + " is at x = " + x + ", y = " + y;
    }

    public boolean equals(Point p) {
        if (!(p instanceof Point)) {
            return false;
        }
        return x == p.x && y == p.y;
    }
}
