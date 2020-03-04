public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Action action = new Action();
        action.setId("1");
        action.setName("张三");
        action.setAge(10);

        String s = action.showInfo();
        System.out.println("这是主控制台输出："+ s);

    }
}
