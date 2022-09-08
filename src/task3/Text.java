package task3;

public class Text {
    public static void main(String[] args) {
        String text = "Java (вимовляється Джава[4]) — об'єктно-орієнтована мова програмування, випущена 1995 року компанією «Sun Microsystems» як основний компонент платформи Java. З 2009 року мовою займається компанія «Oracle», яка того року придбала «Sun Microsystems». В офіційній реалізації Java-програми компілюються у байт-код, який при виконанні інтерпретується віртуальною машиною для конкретної платформи." ;
        String substring = text.substring(0,text.length() / 2);
        String substring2 = text.substring(text.length() / 2 + 1);
        System.out.println(substring);
        System.out.println();
        System.out.println(substring2);
    }
}
