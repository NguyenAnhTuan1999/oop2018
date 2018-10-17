/**
 * Package làm bài tập tuần 5 và tuần 6
 * Đọc yêu cầu đề bài ở week5_6.pdf
 */
package week5_6;

import javax.swing.*;
import java.util.ArrayList;

class Diagram extends JFrame{
    ArrayList<Layer> layers = new ArrayList<>();

    public void add(Layer layer){
        layers.add(layer);
    }

    public void deleteCircle(){

        for (int i=0; i<layers.size(); i++){
            for (int j=0; j<layers.get(i).shapes.size(); j++)
            if (layers.get(i).shapes.get(j) instanceof Circle ){
                 layers.get(i).shapes.remove(j);
            }
        }
    }
}

class Layer extends JPanel{
    ArrayList<Shape> shapes = new ArrayList<>();

    public void add(Shape shape){
        shapes.add(shape);
    }

    public void deleteRectangle(){

        for (int i=0; i<shapes.size(); i++){
            if (shapes.get(i) instanceof Rectangle ){
                shapes.set(i, null);
            }
        }
    }


    public static void main(String[] args){

        Layer a = new Layer();

        Circle c1 = new Circle();
        Circle c2 =new Circle();
        Rectangle r1 = new Rectangle(1, 1, 1, 1);
        Triangle t1 = new Triangle(1, 1, 1);
        Square s1 = new Square(1, 1, 1);
        a.add(c1);
        a.add(r1);
        a.add(t1);
        a.add(s1);
        a.add(c2);
        Diagram d = new Diagram();
        d.add(a);
        d.deleteCircle();
//        a.deleteRectangle();
        for (int i=0; i<d.layers.size(); i++){
            for (int j=0; j<d.layers.get(i).shapes.size(); j++){
                System.out.println(d.layers.get(i).shapes.get(j));
            }
        }

    }
}

class Shape {
    int x, y;

}

class Rectangle extends Shape{
    int length, width;
    public Rectangle(int x, int y, int length, int width){
        this.x = x;
        this.y = y;
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}

class Square extends Shape{
    int side;
    public Square(int x, int y, int side){
        this.x = x;
        this.y = y;
        this.side = side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }
}

class Triangle extends Shape{
    int side;
    public Triangle(int x, int y, int side){
        this.x = x;
        this.y = y;
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}

class Circle extends Shape{
    int radius;
    public Circle(){

    }

    public Circle(int x, int y, int radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

}