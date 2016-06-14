package colorchen.com.c_decorator.test;

import colorchen.com.c_decorator.DarkRoast;
import colorchen.com.c_decorator.Espresso;
import colorchen.com.c_decorator.HouseBlend;
import colorchen.com.c_decorator.Mocha;
import colorchen.com.c_decorator.Soy;
import colorchen.com.c_decorator.Whip;
import colorchen.com.c_decorator.base.Beverage;

/**
 * Created by color on 16/6/13 15:19.
 */
public class Test {
    public static void main(String[] arr) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + "$:" + beverage.cost());

        Beverage beverage1 = new DarkRoast();
        beverage1 = new Mocha(beverage1);
        System.out.println(beverage1.getDescription()+"$:"+ beverage1.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription()+"$:"+ beverage2.cost());

        Beverage beverage3 = new HouseBlend();//1.4
        beverage3 = new Mocha(beverage3);//0.3
        System.out.println(beverage3.getDescription()+"$:"+ beverage3.cost());

        Beverage beverage4 = new HouseBlend();//1.4
        beverage4 = new Soy(beverage4);//0.2
        System.out.println(beverage4.getDescription()+"$:"+ beverage4.cost());

        Beverage beverage5 = new HouseBlend();//1.4
        beverage5 = new Whip(beverage5);//0.1
        System.out.println(beverage5.getDescription()+"$:"+ beverage5.cost());



        /*

        解释关系:饮料(这里指的是coffee)  分为三种Espresso$,DarkRoast,House Blend Coffee;
        不同的调料 可以用不用调料调配出不同的coffee 例如:Mocha,Soy
        test 的结果

        Espresso$:1.99
        DarkRoast,Mocha$:1.3
        DarkRoast,Whip$:1.1
        House Blend Coffee,Mocha$:1.7
        House Blend Coffee,Soy$:1.5999999999999999
        House Blend Coffee,Whip$:1.5*/

    }
}
