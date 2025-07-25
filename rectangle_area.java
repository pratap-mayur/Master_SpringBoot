//Q2. Create a Rectangle class
//
//Fields: length, width
//
//Method: calculateArea()
//
//Input values via constructor and print area.
class area{
    private int length;
    private int width;

    public void setLength(int length) {
        this.length = length;
    }
    public int getLength(){
        return length;
    }
    public void setWidth(int width){
        this.width = width;
    }
    public int getWidth(){
        return width;
    }
    area(){
        this.length = 0;
        this.width = 0;
    }
    area(int length,int width){
        this.length =length;
        this.width = width;
    }
    public int calculatearea(){
        return length*width;
    }
    public int calculatearea(int length, int width){
        return length*width;
    }
}

public class rectangle_area {
    public static void main(String[] args){
        area ar = new area(11,13);
        area ar1 = new area();
        System.out.println(ar.calculatearea());
        ar1.setLength(14);
        ar1.setWidth(14);
        System.out.println(ar1.calculatearea(ar1.getLength(),ar1.getWidth()));
    }
}
