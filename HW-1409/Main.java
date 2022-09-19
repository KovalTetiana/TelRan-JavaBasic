

public class Main {
    public static void main(String[] args) {

/*  Представьте, что вы пишите банковскую программу.
Вам нужно реализовать метод, который вместо заданной строки с номером счета
(например ”DE5128279087265”) возвращает строку вида ”DE51*********65”
(количество звездочек соответствует количеству засекреченных цифр).
Реализуйте 2 варианта метода:
1) с использованием только циклов, length() и charAt()
2) используя любые необходимые методы класса String
**/

        String str = "DE5128279078265";
        char oldChar = ' ';
        char newChar = '*';

        System.out.println("Вывод 1 вариант:" + replace(str, oldChar, newChar));
        System.out.printf( "Вывод 2 вариант:" + str.replace(str.substring(4, 13), "*********"));




    }


    public static String replace(String str, char OldChar, char newChar) {


        String res = "";
        String part1 ="";
        String part2 ="";
        String part3="";



              for (int j = 0; j <= 3; j += 1) {

                char ch1 = str.charAt(j);
                part1 = part1 + str.charAt(j);

              }

            for ( int i = 4; i<= 12;i+= 1) {

                char ch2 = str.charAt(i);
                part2 = part2+ (ch2=newChar);

            }

            for (int i= 13;i<str.length() ;i+= 1) {

                char ch3 = str.charAt(i);
                part3 = part3+str.charAt(i) ;


            }


        return res=part1+part2+part3;




    }
}

