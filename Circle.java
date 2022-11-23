public class Circle {
    private double radius;
    private double diameter;

    Circle (double radius, double diameter) {
        this.radius = radius;
        this.diameter = diameter;
    }



    public double getRadius() {
        return radius;
    }
    public double getDiameter() {
        return diameter;
    }
   public double countCArea(double diameter){
     double carea = Math.PI * diameter * diameter;
     return  carea;
   }
   public double countCLength( double radius){
        double clength = Math.PI * radius * 2;
        return clength;
   }
}
