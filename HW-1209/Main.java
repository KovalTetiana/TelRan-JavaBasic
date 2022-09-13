
/*Коваль Татьяна, группа 35-36ma
Написать метод String replace(String str, char oldChar, char newChar)
который в переданной строке str меняет все символы  oldChar на символы newChar.
 Например: replace(«саша», ‘c’, ‘м’) -> «маша»
 */


public class Main {
    public static void main(String[] args) {

        String str = "vova";
        char oldChar = str.charAt(0);
        char newChar = 's';

        System.out.printf(replace(str,oldChar,newChar));
    }

        public static String replace(String str, char oldChar, char newChar) {
             String strNew = "";
             oldChar=newChar;
             System.out.print(oldChar);

             for (int i=1 ;i <str.length();i+=1 ){

               strNew=strNew+str.charAt(i);
        }
            return strNew;

        }

}