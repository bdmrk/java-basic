package info.kausar;
interface Abc {
    void show();
}
public class AnonymousWithInterface{
    public static void main(String[] args) {
        Abc obj = new Abc() {
            //interface with anonymous class
            //it'll not cost memory
            //can't reuse this defination
            //only for this class
            @Override
            public void show() {
                System.out.println("hello");
            }
        };

        obj.show();

    }


}
