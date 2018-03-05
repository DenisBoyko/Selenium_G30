package conditions;

public class Conditions {
    public static void main(String[] args){
        int a = 5;
        int b = 7;
        int c = 89;
        int d = 47;

        if (a > b || c > d){
           System.out.println(1);
        } else if (a < b && c < d){
            System.out.println(2);
        } else {
            System.out.println(3);
        }

        switch (78){
        case 5:
        case 89:
            System.out.println(5);
            break;
        case 7:
            System.out.println("no");
                break;
        default:
            System.out.println("hz not found");
            break;
        }
        String text = "hello";
        System.out.println(text);
    }




}
