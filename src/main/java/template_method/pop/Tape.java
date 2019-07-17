package template_method.pop;

public class Tape {
    private void broadcast(){
        System.out.println("播放磁带");
    }

    private ProcessSteps template =new ProcessSteps();

    public void run(){
        template.open();
        broadcast();
        template.close();
    }
}
