public class Main {
    public static void main(String[] args) {
//Задание 1
        int number = 1;
        while (number <= 10) {
            System.out.print(number + " ");
            number++;
        }
        {
            System.out.println();
        }
        int number1 = 10;
        for (; number1 >= 1; number1--) {
            System.out.print(number1 + " ");
        }
//Задание 2
        int friday = 5;
        System.out.println("Сегодня пятница, " + friday + "-е число");
        for (; friday <= 31; friday = friday + 7) {
            System.out.println("Сегодня пятница, " + friday + "-е число");
        }
//Задание 3
        int year = 0;
        for (; year <= 2122; year = year + 79) {
            if (year >= 1822) {
                System.out.println(year);
            }
        }
//Задание 4
        int i1 = 1;
        for (; i1 <= 30; i1++) {
            if (i1 % 3 == 0 && i1 % 5 !=0) {
                System.out.print( i1 + " ping"); System.out.println();}
                else if (i1 % 5 == 0 && i1 % 3 != 0) {
                    System.out.print(i1 + " pong"); System.out.println();
                }
                else if (i1 % 5 == 0 && i1 % 3 == 0) {
                    System.out.print(i1 +" ping pong"); System.out.println();
            }
            else {
            System.out.println(i1);}

            }
//Задание 5
        int[] f = new int[10];
        f[0] = 0;
        f[1] = 1;
        System.out.print((f[0] + " " + f[1] + " "));
        for (int i = 2; i < 10; i++) {
            f[i] = f[i - 1] + f[i - 2];
            System.out.print((f[i] + " "));


        }
    }
}