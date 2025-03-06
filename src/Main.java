import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nSelect a shape:");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Square");
            System.out.println("4. Sphere");
            System.out.println("5. Cylinder");
            System.out.println("6. Equilateral Pyramid");
            System.out.println("7. Triangle");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 8) break;

            Shape shape = null;
            switch (choice) {
                case 1:
                    System.out.print("Enter radius: ");
                    double radius = scanner.nextDouble();
                    shape = new Circle(radius);
                    break;
                case 2:
                    System.out.print("Enter length: ");
                    double length = scanner.nextDouble();
                    System.out.print("Enter width: ");
                    double width = scanner.nextDouble();
                    shape = new Rectangle(length, width);
                    break;
                case 3:
                    System.out.print("Enter side length: ");
                    double side = scanner.nextDouble();
                    shape = new Square(side);
                    break;
                case 4:
                    System.out.print("Enter radius: ");
                    radius = scanner.nextDouble();
                    shape = new Sphere(radius);
                    break;
                case 5:
                    System.out.print("Enter radius: ");
                    radius = scanner.nextDouble();
                    System.out.print("Enter height: ");
                    double height = scanner.nextDouble();
                    shape = new Cylinder(radius, height);
                    break;
                case 6:
                    System.out.print("Enter base side: ");
                    side = scanner.nextDouble();
                    System.out.print("Enter height: ");
                    height = scanner.nextDouble();
                    shape = new EquilateralPyramid(side, height);
                    break;
                case 7:
                    System.out.print("Enter base: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter height: ");
                    height = scanner.nextDouble();
                    shape = new Triangle(base, height);
                    break;
                default:
                    System.out.println("Invalid choice!");
                    continue;
            }

            System.out.println("Area: " + shape.calculateArea());
            System.out.println("Perimeter: " + shape.calculatePerimeter());

            if (shape instanceof Volume) {
                System.out.println("Volume: " + ((Volume) shape).calculateVolume());
            }
        }
        scanner.close();
    }
}