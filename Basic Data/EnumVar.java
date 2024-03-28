class FruitClass{
    enum FruitSize{ small, medium, large};
    FruitSize size;
}

public class EnumVar{
    public static void main(String args[]){
        FruitClass fruit =new FruitClass();
        fruit.size=FruitClass.FruitSize.large;
        System.out.println(fruit.size);
    }
}