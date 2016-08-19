package colorchen.com.h_prototype.sample;

/**
 * Created by color on 16/6/16 17:26.
 */
public class Coffee extends CaffeineBeverage{

    @Override
    void brew() {
        System.out.println("冲泡咖啡");
    }

    @Override
    void addCondiment() {
        System.out.println("加糖和牛奶");
    }
}
