package colorchen.com.f_command.model;

/**
 * Created by color on 16/6/14 18:31.
 */
public class Stereo {
    public void on(){
        System.out.println("打开---音响");
    }

    public void off(){
        System.out.println("关闭---音响");
    }

    public void setCD(){
        System.out.println("设置成播放CD");
    }

    public void setVolume(int num){
        System.out.println("把音量设置成:"+num);
    }
}
