package colorchen.com.h_prototype.more;

/**
 * Created by color on 16/6/16 18:20.
 */
public class Test {
    public static void main(String[] args) {
        CoffeeWithHook coffeeWithHook = new CoffeeWithHook();

        System.out.println("做一杯咖啡");
        coffeeWithHook.prepareRecipe();



        /*
        模板方法模式
        test:结果
        做一杯咖啡
        把水烧开
        倒咖啡用钩子
        把水倒进杯子里
        来电带糖的咖啡吗
         y
        加糖和牛奶*/
    }
}
