import java.util.ArrayList;

/**
 * Created by BHarris on 1/30/17.
 */
public class EasyMath {
    private int sum;
    private double average;
    private ArrayList<Integer> numbers;

    public EasyMath() {
        this.numbers = new ArrayList<>();
    }

    public void addNumbers(int number){
        this.numbers.add(number);
    }

    public int getSum(){

        for(int number : this.numbers) {
            this.sum += number;
        }
        return this.sum;
    }

    public double getAverage(){
        this.average =  (double)this.sum/numbers.size();
        return this.average;
    }
}
