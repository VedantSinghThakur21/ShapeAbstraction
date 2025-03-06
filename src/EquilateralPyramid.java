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

     }
