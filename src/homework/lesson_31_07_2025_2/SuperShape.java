package homework.lesson_31_07_2025_2;

import java.util.Objects;

public abstract class SuperShape {
    private String color;

    public SuperShape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void draw();

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SuperShape that = (SuperShape) o;
        return Objects.equals(color, that.color);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(color);
    }


    //    double coor1;
//    double coor2;
//
//    public SuperShape(double coor1, double coor2) {
//        this.coor1=coor1;
//        this.coor2=coor2;
//    }



}
