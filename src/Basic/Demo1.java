package Basic;

class Add {

    public int add(int x, int y) {
        int r = x + y;
        return r;
    }
}

public class Demo1 {

    public static void main(String[] args) {
        int x = 12;
        int y = 91;
        Add a1 = new Add();
        // System.out.println(x + y);
        System.out.println(a1.add(x, y));
    }
}
