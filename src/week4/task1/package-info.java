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
    // Thuoc tinh:
    private String color = "red";
    private boolean filled = true;

    // Constructor:
    public Shape(){

    }

    public Shape(String color, boolean filled){

    }

    // Getter/Setter:
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
        Circle c = new Circle();
        c.setRadius(4.5);
        System.out.println("Chu vi: " + c.getPerimeter());
        System.out.println("Dien tich: " + c.getArea());
    }
}

class Circle extends Shape{
    // Thuoc tinh:
    private double radius = 1.0;
    private final double PI = 3.14;

    // Constructor:
    public Circle(){

    }

    public Circle(double radius){

    }

    public Circle(double radius, String color, boolean filled){

    }

    // Getter/Setter:
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
    // Thuoc tinh:
    private double width = 1.0;
    private double length = 1.0;

    // Constructor:
    public Rectangle(){

    }

    public Rectangle(double width, double length){

    }

    // Getter/Stter:
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

    // Constructor:
    public Square(){

    }

    public Square(double side){

    }

    public Square(double side, String color, boolean filled){

    }

    // Getter/Setter:
    public double getSide(){
        return getWidth();
    }

    public void setSide(double side){
        setWidth(side);
        setLength(side);
    }

    public void setWidth(double side){
        setWidth(side);
    }

    public void setLength(double side){
        setLength(side);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

