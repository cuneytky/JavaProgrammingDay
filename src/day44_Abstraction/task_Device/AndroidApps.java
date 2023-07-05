package day44_Abstraction.task_Device;

public interface AndroidApps extends downloadable{

    String Appstore= "Google play Store";
    String OS = "Android has OS";

    @Override
    void downloadApp();
}
