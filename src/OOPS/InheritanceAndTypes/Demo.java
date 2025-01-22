package OOPS.InheritanceAndTypes;

class Calculator {

    int sum(int n1, int n2) {
        return n1 + n2;
    }

    int diff(int n1, int n2) {
        return n1 - n2;
    }
}

class AdvanceCalc extends Calculator{
    int mul(int n1,int n2){
        return n1*n2;
    }
    int div(int n1,int n2){
        return n1/n2;
    }
}

public class Demo {
    public static void main(String[] args) {
        AdvanceCalc c = new AdvanceCalc();
        System.out.println("Sum of 2 nums is : "+c.sum(2, 3));
        System.out.println("Diff of 2 nums is : "+c.diff(6, 3));
        System.out.println("Mul : "+ c.mul(2,3)+" Div: "+c.div(1,3));
    }
}
