package colorchen.com.h_prototype.more;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by color on 16/6/16 18:06.
 */
public class CoffeeWithHook extends CaffeineBeverageWithHook {
    @Override
    void brew() {
        System.out.println("倒咖啡用钩子");
    }

    @Override
    void addCondiments() {
        System.out.println("加糖和牛奶");
    }

    @Override
    public boolean customerWantsCondiments() {
        String answer = getUserInPut();
        if (answer.toLowerCase().startsWith("y")){
            return true;
        }else{
            return false;
        }
    }

    private String getUserInPut() {
        String answer = null;
        System.out.println("来电带糖的咖啡吗");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException e) {
            System.err.println("IO异常");
        }
        if (answer == null){
            return "no";
        }
        return answer;
    }
}
