import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        /*//Напишите метод, который принимает в качестве параметра любую строку, например “I like Java!!!”.
        String str = "I like java!!?";
        //Распечатать последний символ строки. Используем метод String.charAt().
        System.out.println(str.charAt(str.length() - 1));
        //Проверить, заканчивается ли ваша строка подстрокой “!!!”. Используем метод String.endsWith().
        System.out.println(str.endsWith("!!!"));
        //Поверить, начинается ли ваша строка подстрокой “I like”. Используем метод String.startsWith().
        System.out.println(str.startsWith("I like"));
        //Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
        System.out.println(str.contains("Java"));
        //Найти позицию подстроки “Java” в строке “I like Java!!!”.
        //System.out.println(str.indexOf("Java", 15));  15 - индекс с которого начинается поиск
        System.out.println(str.indexOf("java"));
        //Заменить все символы “а” на “о”.
        System.out.println(str.replace("a", "o"));
        //Преобразуйте строку к верхнему регистру.
        System.out.println(str.toLowerCase(Locale.ENGLISH)); //В скобках передается на каком языке текст.
        //Преобразуйте строку к нижнему регистру.
        System.out.println(str.toUpperCase(Locale.ENGLISH));
        //Вырезать строку Java c помощью метода String.substring().
        System.out.println(str.substring(str.indexOf("I like"), str.indexOf("I like") + "I like".length())); //вводятся индексы символов*/


        /*//Дано два числа, например 3 и 56, необходимо составить следующие строки:
        //3 + 56 = 59
        //3 – 56 = -53
        //3 * 56 = 168.
        //Используем метод StringBuilder.append().
        //Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(), StringBuilder.deleteCharAt().
        //Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
        //Смотрите решение задачи в видео.
        Integer x, y;
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in)); //BufferedReader - буферезует, InputStreamReader - читает System.in - откуда
        String str = buf.readLine();
        x = Integer.parseInt(str);
        str = buf.readLine();
        y = Integer.parseInt(str);
        Integer res = x + y;
        StringBuilder sb = new StringBuilder(x.toString());
        sb.append(" + ");
        sb.append(y.toString());
        sb.append(" = ");
        sb.append(res.toString());
        StringBuilder sb1 = new StringBuilder(sb.toString());
        StringBuilder sb2 = new StringBuilder(sb.toString());
        sb1.deleteCharAt(sb.toString().indexOf('='));
        sb1.insert(sb.toString().indexOf('='), "равно");
        sb2.replace(sb.toString().indexOf('='), sb.toString().indexOf('=')+1, "равно");
        System.out.println("sb1: "+sb1);
        System.out.println("sb2: "+sb2);*/

        //Напишите метод, заменяющий в строке каждое второе вхождение «object-oriented programming»
        //(не учитываем регистр символов) на «OOP».
        String string = "Object-oriented programming is a programming language model organized around objects rather than \"actions\" and data rather than logic. Object-oriented programming blabla. Object-oriented programming bla.";
        System.out.println(changeFromOOP(string));
    }
    public static String changeFromOOP(String string){
        String str = "";
        int i = 0;
        int j = 0;
        while (string.lastIndexOf("Object-oriented programming", i) == -1){
            i = string.indexOf("Object-oriented programming", i) + "Object-oriented programming".length();
            if (j % 2 != 0) {
                str = string.replace("Object-oriented programming", "OOP");
            }
            j++;
        }
        return str;
    }
}
