class EquilateralPyramid extends Shape {
          private double baseSide, height;

    public EquilateralPyramid(double baseSide, double height) {
               super("Equilateral Pyramid");
               this.baseSide = baseSide;
               this.height = height;
          }

          public double calculatePerimeter() {
               return 4 * baseSide;
          }

          public double calculateArea() {
               double baseArea = baseSide * baseSide;
               double slantHeight = Math.sqrt((baseSide / 2) * (baseSide / 2) + height * height);
               double lateralArea = 2 * baseSide * slantHeight;
               return baseArea + lateralArea;
          }

          public double calculateVolume() {
               return (1.0 / 3.0) * baseSide * baseSide * height;
          }
     }
