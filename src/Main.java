public class Main {
    public static void main(String[] args) {
//Задание 1
        int number = 1;
        while (number <= 10)
        { System.out.print(number + " "); number++;}
        { System.out.println();}
        int number1 = 10;
        for (;number1 >= 1; number1--)
        { System.out.print(number1 + " ");}
//Задание 2
        int friday = 1;
        System.out.println("Сегодня пятница, " + friday + "-е число");
        for (;friday <= 31; friday = friday + 7) {
            System.out.println("Сегодня пятница, " + friday + "-е число");
        }
//Задание 3
        int year = 0;
        for ( ;year <= 2122; year = year + 79) {
            if(year >= 1822)
            {System.out.println( year );}
        }



    }


}