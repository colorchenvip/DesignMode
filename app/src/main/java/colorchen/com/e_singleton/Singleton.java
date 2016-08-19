package colorchen.com.e_singleton;

/**
 * Created by color on 16/6/14 15:45.
 */
public class Singleton {
    /*当uniqueInstance变量被初始化Singleton实例时,多线程正确的处理uniqueInstance*/
    private volatile static Singleton uniqueInstance;

    public Singleton() {
    }

    public static  Singleton getInstance(){
        if (uniqueInstance == null){
            synchronized (Singleton.class){
                uniqueInstance = new Singleton();
            }
        }
        return uniqueInstance;
    }
}
