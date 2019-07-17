package template_method.pop;

public class Dvd {
    private void broadcast(){
        System.out.println("播放光盘");
    }

    private ProcessSteps template =new ProcessSteps();

    public void run(){
        template.open();
        broadcast();
        template.close();
    }
}
