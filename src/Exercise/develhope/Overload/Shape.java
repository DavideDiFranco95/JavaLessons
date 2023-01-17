package Exercise.develhope.Overload;

public class Shape {
    public String shapeName;
    public int numberOfEdges;

    public Shape(){
        System.out.println("An Object's Shape has been created!");
        this.shapeName="undefined Shape Name";
    }
    public Shape(double radius){
        this.shapeName="Circle";
        System.out.println("A Circle has been created!");
    }
    public Shape(int edges,double edgeLength){
        this.shapeName="Square";
        this.numberOfEdges=4;
        System.out.println("A Square has been created!");
    }
    public Shape(int edges,double edge1,double edge2){
        this.shapeName="Rectangle";
        this.numberOfEdges=4;
        System.out.println("A Rectangle has been created!");
    }
    public Shape(int edges,double edge1,double edge2,double edge3){
        this.shapeName="Triangle";
        this.numberOfEdges=3;
        System.out.println("A Triangle has been created!");
    }

    public String getShapeDetails(Shape shape){
        return shapeName + numberOfEdges;
    }
}
