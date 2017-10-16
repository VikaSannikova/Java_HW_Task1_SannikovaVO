package Task1;

public class Rectangle {
    private float length = 1.0f;
    private float wigth = 1.0f;

    public Rectangle() {
    }

    public Rectangle(float length, float wigth) {
        this.length = length;
        this.wigth = wigth;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWigth() {
        return wigth;
    }

    public void setWigth(float wigth) {
        this.wigth = wigth;
    }
    public double getArea() {
        return this.length*this.wigth; //приведение типов?
    }
    public double getPerimetr(){
      return (this.length+this.wigth)*2;
    }

    @Override
    public String toString() {
        return "Rectangle[" +
                "length=" + length +
                ", wigth=" + wigth +
                ']';
    }
}
