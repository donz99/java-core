package homework.lesson711;

public class Box2 {
    double width;
    double height;
    double depth;
    Box2() {
        System.out.println("Контруктор объекта Box2");
        width = 10;
        height = 10;
        depth = 10;
    }

    double getVolume(){
        return width*height*depth;
    }
}
