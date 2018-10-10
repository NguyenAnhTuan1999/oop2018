/**
 * Package bài làm cho Câu 1
 * TODO: Khai báo các lớp (class) theo Câu 1 yêu cầu. 1 file chỉ khai báo 1 class
 * TODO: Mô tả các quan hệ giữa các class và thêm thuộc tính, phương thức cho chúng (mỗi class ít nhất 2 phương thức, 2 thuộc tính)
 * TODO: Viết comment đầy đủ cho class, phương thức. Xem hướng dẫn tại đây (http://dongdiemthuy.github.io/java/javadoc/2014/09/30/su-dung-javadoc-va-maven-de-tao-tai-lieu-du-an.html)
 * @author cuong
 * @version 0.1
 */
package week4.task1;

class Shape{
    String color = "red";
    boolean filled = true;

    public Shape(){

    }

    public Shape(String color, boolean filled){

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args){
        Square a = new Square();
        System.out.print(a.getArea());
    }
}

class Circle extends Shape{
    double radius = 1.0;
    final double PI = 3.14;

    public Circle(){

    }

    public Circle(double radius){

    }

    public Circle(double radius, String color, boolean filled){

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return PI*radius*radius;
    }

    public double getPerimeter(){
        return 2*PI*radius;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

class Rectangle extends Shape{
    double width = 1.0;
    double length = 1.0;

    public Rectangle(){

    }

    public Rectangle(double width, double length){

    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        return width*length;
    }

    public double getPerimeter(){
        return 2*(width + length);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

class Square extends Rectangle{
    public Square(){

    }

    public Square(double side){

    }

    public Square(double side, String color, boolean filled){

    }

    public double getSide(){
        return width;
    }

    public void setSide(double side){
        width = side;
        length = side;
    }

    public void setWidth(double side){
        width = side;
    }

    public void setLength(double side){
        length = side;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

