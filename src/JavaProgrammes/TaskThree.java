package JavaProgrammes;

public class TaskThree {
    int a = 123;
    static int b = 321;

    public static void main(String[] args) {
        myLuckyNumber();
        TaskThree obj = new TaskThree();

    }
    public static void myLuckyNumber() {
        System.out.println(b);
        TaskThree taskThree = new TaskThree();
        System.out.println(taskThree.a);
    }

    void myFavouriteNumber() {
        System.out.println(a);
        System.out.println(TaskThree.b);
    }
}
