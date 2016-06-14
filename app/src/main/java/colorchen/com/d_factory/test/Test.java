package colorchen.com.d_factory.test;

import colorchen.com.d_factory.base.Pizza;
import colorchen.com.d_factory.base.PizzaStore;
import colorchen.com.d_factory.store.ChicagoPizzaStore;
import colorchen.com.d_factory.store.NYPizzaStore;

/**
 * Created by color on 16/6/13 19:10.
 */
public class Test {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

        Pizza pizza = nyPizzaStore.orderPizza("cheese");
        System.out.println("已经网上订了1个" + pizza.getName() + "\n");


        Pizza pizza1 = chicagoPizzaStore.orderPizza("cheese");
        System.out.println("已经网上订了2个" + pizza1.getName() + "\n");


        Pizza pizza3 = nyPizzaStore.orderPizza("veggie");
        System.out.println("网上订了3个" + pizza3.getName() + "\n");


        Pizza pizza4 = chicagoPizzaStore.orderPizza("veggie");
        System.out.println("已经网上订了44个" + pizza4.getName() + "\n");


        /*
        test结果:

        开始准备纽约风格的沙司和奶酪为的披萨
                高级干奶酪
        烤了20分钟
                切片
        一般包装
                已经网上订了1个纽约风格的沙司和奶酪为的披萨

        开始准备芝加哥CheesePizza
                color奶酪CheesePizza
        烘烤5分钟就好
        切成ding ding
        一般包装
                已经网上订了2个芝加哥CheesePizza

        开始准备纽约风格的Veggie
        高级0--Veggie
                烤了20分钟
        切片
                一般包装
        网上订了3个纽约风格的Veggie

                开始准备芝加哥VeggiePizza
        白奶酪VeggiePizza
                烤了20分钟
        切成大块
                一般包装
        已经网上订了44个芝加哥VeggiePizza*/

    }
}
