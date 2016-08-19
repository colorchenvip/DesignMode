package colorchen.com.h_prototype.more;

/**
 * Created by color on 16/6/16 17:36.
 */
public abstract class CaffeineBeverageWithHook {

    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()){
            addCondiments();
        }
    }

    public boolean customerWantsCondiments() {
        return true;
    }

    private void pourInCup() {
        System.out.println("把水倒进杯子里");
    }

    private void boilWater() {
        System.out.println("把水烧开");
    }

    abstract void brew();

    abstract void addCondiments();

}
