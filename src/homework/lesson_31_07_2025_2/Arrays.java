package homework.lesson_31_07_2025_2;

public class Arrays {
    public static void main(String[] args) {
        SuperShape[] shapes = new SuperShape[3];
        shapes[0]= new Circle("red",6,7,30);
        shapes[1]= new Rectangle("blue",2,5,1,7);
        shapes[2]= new Rectangle("yellow",1,5,6,2);
        for(SuperShape shape: shapes){
            shape.draw();
        }
    }


}
