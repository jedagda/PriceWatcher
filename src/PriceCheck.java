import java.util.Random;

public class PriceCheck  {
    private double min = 5.99;
    private double max = 16.99;

    public double randomPrice(){
        Random random = new Random();
        return min +(max-min)*random.nextDouble();

    }

  
}
