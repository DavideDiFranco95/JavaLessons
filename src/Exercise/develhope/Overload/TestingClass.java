package Exercise.develhope.Overload;

public class TestingClass {
    public static void main(String[] args) {
        Shape shape1,shape2,shape3,shape4,shape5;
        shape1=new Shape();
        shape2=new Shape("Circle",0,3.5);
        shape3=new Shape("Square",4,4,7);
        shape4=new Shape("Rectangle",4,4,1,2);
        shape5=new Shape("triangle",4,4,1,2,3);

        System.out.println(shape1.getShapeDetails(shape1));
        System.out.println(shape2.getShapeDetails(shape2));
        System.out.println(shape3.getShapeDetails(shape3));
        System.out.println(shape4.getShapeDetails(shape4));
        System.out.println(shape5.getShapeDetails(shape5));
    }
}
