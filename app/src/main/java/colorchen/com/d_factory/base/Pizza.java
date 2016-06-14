package colorchen.com.d_factory.base;

import java.util.ArrayList;

/**
 * 披萨接口
 * Created by color on 16/6/13 17:45.
 */
public abstract class Pizza {


     public String name;
     public String dough;
     public String sauce;
     public ArrayList toppings = new ArrayList();

     public void prepare(){
          System.out.println("开始准备"+name);
          for (int i = 0; i < toppings.size(); i++) {
               System.out.println(" "+toppings.get(i));
          }

     }
     public void bake(){
          System.out.println("烤了20分钟");
     }
     public void cut(){
          System.out.println("切片");
     }
     public void box(){
          System.out.println("一般包装");
     }

     public String getName(){
          return name;
     }
}
