package homework.lesson_31_07_2025;

import inheritance.Triangle2;

public class FindAreas {
    public static void main(String[] args) {
        Figure[] figures = new Figure[3];
        figures[0]=new Rectangle(20, 10);
        figures[1]=new Rectangle(20, 10);
        figures[2]=new Triangle(20, 10);
        for (Figure figure : figures) {
            figure.area();
        }
    }
}
