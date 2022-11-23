public class Rectangle {
    private int width;
    private int height;

    Rectangle(){
        this.width=120;
        this.height=50;
    }
    Rectangle(int width,int height){
        this.width=width;
        this.height=height;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
    public int countArea(int height,int width){
        int area = width * height;
        return area;
    }
    public int countPerimeter (int width,int height){
        int perimeter= (height+width)*2;
        return perimeter;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
