public class Main04 {

    public static void main(String[] args) {
        LinkedIntList04 a = new LinkedIntList04();
        a.add(1);
        a.add(4);
        a.add(6);
        a.add(4);
        System.out.println(a.lastIndexOf(1));
        System.out.println(a.lastIndexOf(4));
    }
}
