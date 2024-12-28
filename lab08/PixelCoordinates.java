package lab08;

public class PixelCoordinates {
    private int x;
    private int y;

    public PixelCoordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        PixelCoordinates that = (PixelCoordinates) obj;
        return x == that.x && y == that.y;
    }

    @Override
    public String toString() {
        return "PixelCoordinates{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

class ColoredPixel extends PixelCoordinates {
    private String color;

    public ColoredPixel(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "ColoredPixel{" +
                "x=" + getX() +
                ", y=" + getY() +
                ", color='" + color + '\'' +
                '}';
    }
}
