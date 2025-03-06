class Sphere extends Shape implements Volume{
    private double radius;

    public Sphere(double radius) {
        super("Sphere");
        this.radius = radius;
    }

    public double calculatePerimeter(){
        return 2 * Math.PI * radius;
    }

    public double calculateArea(){
        return 4 * Math.PI * radius * radius;
    }

    public double calculateVolume(){
        return 4/3 * Math.PI * radius * radius;
    }
}
