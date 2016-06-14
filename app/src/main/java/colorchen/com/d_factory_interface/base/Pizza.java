package colorchen.com.d_factory_interface.base;

import colorchen.com.d_factory_interface.bean.base.Cheese;
import colorchen.com.d_factory_interface.bean.base.Clams;
import colorchen.com.d_factory_interface.bean.base.Dough;
import colorchen.com.d_factory_interface.bean.base.Pepperoni;
import colorchen.com.d_factory_interface.bean.base.Sauce;
import colorchen.com.d_factory_interface.bean.base.Veggie;

/**
 * Created by color on 16/6/14 11:25.
 */
public abstract class Pizza {
    public String name;
    public Dough dough;
    public Veggie veggie;
    public Sauce sauce;
    public Cheese cheese;
    public Pepperoni pepperoni;
    public Clams clams;

    public abstract  void prepare();

    public void bake(){
        System.out.println("烤熟要5---10分钟");
    }

    public void cut(){
        System.out.println("模式是切片");
    }

    public void box(){
        System.out.println("默认精美包装");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
