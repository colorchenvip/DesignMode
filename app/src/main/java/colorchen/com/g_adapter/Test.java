package colorchen.com.g_adapter;

import colorchen.com.g_adapter.adapter.TurkeyAdapter;
import colorchen.com.g_adapter.duck.Duck;
import colorchen.com.g_adapter.duck.MallardDuck;
import colorchen.com.g_adapter.turkey.WildTurkey;

/**
 * Created by color on 16/6/15 15:28.
 */
public class Test {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();
        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("火鸡要说话了:");
        turkey.gobble();
        turkey.fly();

        System.out.println("\n鸭子也要说话了:");
        testDuck(duck);

        System.out.println("\n适配的造出的山寨鸭子这样说:");
        testDuck(turkeyAdapter);



        /*
        test测试结果:

        火鸡要说话了:
        咯咯。。。
        也会飞。。。

        鸭子也要说话了:
        嘎嘎。。。
        我会飞了

        适配的造出的山寨鸭子这样说:
        咯咯。。。
        也会飞。。。
        也会飞。。。
        也会飞。。。
        也会飞。。。
        也会飞。。。*/

        /*注:
           >1. 客户通过了目标接口调用了适配器方法对适配器发出请求
           >2. 适配器使用了被适配着的接口把请求转换成被适配着的一个或是多个调用接口
           >3. 客户接收到调用的结果,但并没有觉察这一切是适配器在起的结果*/

    }

    static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
}
