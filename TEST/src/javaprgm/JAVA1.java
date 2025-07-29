package javaprgm;

class Box {
    double width;
    double height;
    double depth;

    // Constructor
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // Method to calculate volume
    double getVolume() {
        return width * height * depth;
    }
}

public class JAVA1 {
    public static void main(String[] args) {
        Box myBox = new Box(2.0, 3.0, 4.0);
        System.out.println("The volume of the box is: " + myBox.getVolume());
    }
}
