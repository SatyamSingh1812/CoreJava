package Constructor;
class Demo {
    int num;
    //Default constructor
    public Demo() {
        System.out.println("Inside the Demo Constructor");
    }
    //Parameterized constructor
    public Demo(int n) {
        this.num = n;
        System.out.println(num);
    }
}

public class BasicConstrutor {
    public static void main(String[] args) {
        Demo dem = new Demo();
        Demo demo = new Demo( 7);

    }

}
