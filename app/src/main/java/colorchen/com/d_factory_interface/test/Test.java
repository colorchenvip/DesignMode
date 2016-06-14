package colorchen.com.d_factory_interface.test;


import colorchen.com.d_factory_interface.NYPizzaStore;
import colorchen.com.d_factory_interface.base.Pizza;
import colorchen.com.d_factory_interface.base.PizzaStore;

/**
 * 抽象工厂设计模式
 * Created by color on 16/6/14 14:06.
 */
public class Test {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        Pizza orderPizza = nyPizzaStore.orderPizza("cheese");

        System.out.println("success order:" + orderPizza.getName()+"\n");


        PizzaStore nyPizzaStore1 = new NYPizzaStore();
        Pizza orderPizza1 = nyPizzaStore1.orderPizza("veggie");

        System.out.println("success order:" + orderPizza1.getName());




        /*
        test 结果:

        准备纽约风味cheese
        烤熟要5---10分钟
                模式是切片
        默认精美包装
        success order:纽约风味cheese

                准备纽约风格的clam
        只需要4--5分钟就好哦
                可以整体包装,不切哦
        今天特惠,免费送高级包装
        success order:纽约风格的clam*/
    }
}
