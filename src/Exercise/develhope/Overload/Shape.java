package Exercise.develhope.Overload;

public class Shape {
    public String shapeName;
    public int numberOfEdges;

    public Shape(){
        System.out.println("An Object's Shape has been created!");
        this.shapeName="undefined Shape Name";
    }
    public Shape(String shapeName,int numberOfEdges,double radius){
        this.shapeName=shapeName;
        this.numberOfEdges=numberOfEdges;
        radius=radius;
        System.out.println("A Circle has been created!");
    }
    public Shape(String shapeName,int numberOfEdges,int edges,double edgeLength){
        this.shapeName=shapeName;
        this.numberOfEdges=numberOfEdges;
        edges=edges;
        edgeLength=edgeLength;
        System.out.println("A Square has been created!");
    }
    public Shape(String shapeName,int numberOfEdges,int edges,double edge1,double edge2){
        this.shapeName=shapeName;
        this.numberOfEdges=numberOfEdges;
        edges=edges;
        edge1=edge1;
        edge2=edge2;
        System.out.println("A Rectangle has been created!");
    }
    public Shape(String shapeName,int numberOfEdges,int edges,double edge1,double edge2,double edge3){
        this.shapeName=shapeName;
        this.numberOfEdges=numberOfEdges;
        edges=edges;
        edge1=edge1;
        edge2=edge2;
        edge3=edge3;
        System.out.println("A Triangle has been created!");
    }

    public String getShapeDetails(Shape shape){
        return shapeName + numberOfEdges;
    }
}
