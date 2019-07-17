package template_method.oop;

public abstract class ProcessSteps {
    public void open(){
        System.out.println("打开机器");
    }

    public abstract void broadcast();

    public void close(){
        System.out.println("关闭机器");
    }

    public void run(){
        open();
        broadcast();
        close();
    }
}
