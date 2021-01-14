
public class Square {
  private double side;
  public final int MAX_SIDE_LENGTH = 10;

  public Square (double theSide){
    side = theSide;
  }

  public double getSide (){
    return side;
  }

  public void setSide (double theSide){
    if (theSide>= 0 && theSide < MAX_SIDE_LENGTH)
    this.side = theSide;
  }

  public String toString(){
    return "Square with side length = " +side;
  }

  public double area() {
    return side*side;
  }

  public double diagonal() {
    return (Math.sqrt(2)*side);
  }
  
}
