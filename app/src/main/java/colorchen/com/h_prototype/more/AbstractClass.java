package colorchen.com.h_prototype.more;

/**
 * 模板方法 增强
 * Created by color on 16/6/16 17:58.
 */
public abstract class AbstractClass {

    final void templateMethod() {
        primitiveOperation1();
        primitiveOperation2();
        concreteOperation();
        hook();
    }

    public void hook() {

    }

    final void concreteOperation() {

    }

    protected abstract void primitiveOperation2();

    protected abstract void primitiveOperation1();
}
