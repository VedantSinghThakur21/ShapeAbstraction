class Cylinder extends Shape implements Volume{

    private double radius, height;

    public Cylinder(double radius, double height) {
        super("Cylinder");
        this.radius = radius;
        this.height = height;
    }

    public double calculateArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    public double calculateVolume() {
        return Math.PI * radius * radius * height;
    }
}
