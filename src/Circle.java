class Circle extends Shape {
        private double radius;

        public Circle(double radius) {
            super("Circle");
            this.radius = radius;
        }

        public double calculateArea() {
            return Math.PI * radius * radius;
        }

        public double calculatePerimeter() {
            return 2 * Math.PI * radius;
        }
    }