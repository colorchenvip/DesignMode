package colorchen.com.h_prototype.sample;

/**
 * Created by color on 16/6/16 17:32.
 */
public class Tea extends CaffeineBeverage{

    @Override
    void brew() {
        System.out.println("沏茶");
    }

    @Override
    void addCondiment() {
        System.out.println("加柠檬");
    }
}
