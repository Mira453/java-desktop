package lab08;

public class Main {
    public static void main(String[] args) {
        PixelCoordinates pixel = new PixelCoordinates(10, 20);
        System.out.println("Базовий піксель: " + pixel);

        ColoredPixel coloredPixel = new ColoredPixel(30, 40, "Red");
        System.out.println("Кольоровий піксель: " + coloredPixel);

        coloredPixel.setColor("Blue");
        System.out.println("Змінений кольоровий піксель: " + coloredPixel);
    }
}
