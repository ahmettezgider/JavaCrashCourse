package _09Class.package1;

class defaultClass extends BaseClass{

    String name = "name";

    public static void main(String[] args) {

        defaultClass cls = new defaultClass();

        cls.method1();
        System.out.println(cls);

    }


    @Override
    public void method1(){
        System.out.println("Bu Class'in Method1");
    }

    @Override
    public String toString() {
        return "defaultClass{" +
                "name='" + name + '\'' +
                '}';
    }
}
