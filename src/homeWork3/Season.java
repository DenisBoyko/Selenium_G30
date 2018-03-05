package homeWork3;

public class Season {
    protected void seasonFinding(int month) {
        // Через Switch
        switch (month){
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Вы ввели неправильное число месяца");
                break;
        }
        // Через If - else

        /*if (month == 12 || month == 1 || month == 2) {
            System.out.println("Зима");

        } else if (month == 3 || month == 4 || month == 5) {
            System.out.println("Весна");

        } else if (month == 6 || month == 7 || month == 8) {
            System.out.println("Лето");

        } else if (month == 9 || month == 10 || month == 11) {
            System.out.println("Осень");
        } else {
            System.out.println("Вы ввели неправильное число месяца");
        }*/

    }
}
