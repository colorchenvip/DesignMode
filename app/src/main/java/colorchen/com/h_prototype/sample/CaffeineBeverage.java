package colorchen.com.h_prototype.sample;

/**
 * Created by color on 16/6/16 17:36.
 */
public abstract class CaffeineBeverage {
    public final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiment();
    }

    private void pourInCup() {
        System.out.println("把水烧开");
    }

    private void boilWater() {
        System.out.println("把饮料倒进杯子里");
    }

    abstract void brew();

    abstract void addCondiment();

}
