public class Main {
    public static void main(String[] args) {
        Rectangle r1= new Rectangle();
        Rectangle r2= new Rectangle(12,6);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println("Площа прямокутника #1 = " + r1.countArea (r1.getHeight(), r1.getWidth()));
        System.out.println("Периметр прямокутника #1 = " + r1.countPerimeter (r1.getHeight(), r1.getWidth()));

        System.out.println("Площа прямокутника #2 = " + r2.countArea (r2.getWidth(), r2.getWidth()));
        System.out.println("Периметр прямокутника #2 = " + r2.countPerimeter (r2.getHeight(), r2.getWidth()));

        Circle c1 = new Circle(4,7);
        System.out.println("Площа кола="+ c1.countCArea(c1.getDiameter()) );
        System.out.println("Довжина кола="+ c1.countCLength(c1.getRadius()));

    }
}
