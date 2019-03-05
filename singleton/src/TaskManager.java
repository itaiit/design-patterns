// 有问题的单例模式
public class TaskManager{

    private static TaskManager tm = null;
    private TaskManager(){

    }
    public static TaskManager getInstance(){
        if (tm == null) {
            tm = new TaskManager();
        }
        return tm;
    }

    public static void main(String[] args) {
        TaskManager tm = TaskManager.getInstance();
    }
}

/*
 饿汉式:
    类加载的时候就创建好了对象，占用资源
  */
class EagerSingleton{
    private static final EagerSingleton instance = new EagerSingleton();
    private EagerSingleton(){

    }
    public static EagerSingleton getInstance(){
        return instance;
    }
}
/*
 懒汉式:
    在高并发的情况下，性能受到影响
  */
class LazySingleton{
    private volatile static LazySingleton instance = null;
    private LazySingleton(){

    }
    public static LazySingleton getInstance(){
        if (instance == null){
            synchronized (LazySingleton.class){
                if (instance == null){
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
/*
 二者的均衡:静态内部类
 */
class Singleton{
    private Singleton(){}
    private static class HolderClass{
        private static final Singleton instance = new Singleton();
    }
    public static Singleton getInstance()
    {
        return HolderClass.instance;
    }
}