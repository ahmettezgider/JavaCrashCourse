package _13Enum;

public class Main {

    public static void main(String[] args) {

        System.out.println(ClassEnum.a);
        M1("o");
        M2(ClassEnum.a);
    }



    public static void M2(ClassEnum str){
        switch (str){
            case a:
                break;
            case b:
                break;
            case c:
                break;
            case d:
                break;
            case e:
                break;
            default:
                break;
        }
    }

    public static void M1(String str){

        switch (str){
            case "a":
                break;
            case "b":
                break;

            default:
                break;
        }

    }

}
