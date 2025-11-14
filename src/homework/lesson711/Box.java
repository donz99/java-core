package homework.lesson711;

public class Box {
    double width, height, depth;

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public Box(SomeClass s1){

    }



    public Box(SomeClass s1, SomeClass s2) {

    }

    public Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box(double len){
        width=len;
        height=len;
        depth=len;
    }
}
