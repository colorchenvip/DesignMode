package colorchen.com.g_adapter.turkey;

/**
 * 野火鸡 火鸡的实现类
 * Created by color on 16/6/15 15:20.
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("咯咯。。。");
    }

    @Override
    public void fly() {
        System.out.println("也会飞。。。");
    }
}
