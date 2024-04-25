/*Basic Java Enum Programs*/
class FruitJuice{
  enum FruitJuiceSize{Small, Medium, High}
  FruitJuiceSize size;
}
public class Enum{
  public static void main(String []args){
    FruitJuice juice=new FruitJuice();
    juice.size=FruitJuice.FruitJuiceSize.Medium;
    System.out.println(juice.size);
  }
}
