/**
 * пример содержательного комментария
 *
 * package - папка, для логическое разбиения проекта
 * class - шаблог проектирования объекта
 * типы данных: примитивные / ссылочные.
 * примитивные типы данных:
 * 1. short - целое чисо
 * 2. int - целое чисо (POPULAR)
 * 3. long - целое чисо
 * 4. double - десятичное число (POPULAR)
 * 5. float - десятичное число
 * 6. boolean - true / false (POPULAR)
 * 7. char - 'a', '$'
 * 8. byte - чсло (8 бит)
 * === String - "example of long string 12345" (POPULAR)
 * === Array (POPULAR)
 * === Object (POPULAR)
 *
 * testExampleName - camelCase
 * TEST_PARAM - snake_case
 * test-case - kebab-case (only js)
 *
 * */
// еще пример комментария

public class Calculator {
    // переменная состоит: тип данных + имя переменной + ее значение
    String name = "Sergei";
    int age = 32;
    boolean isStudent = false;

    // метод состоит: имени + сигнатура() + тело для реализации логики
    // если есть возвращаемое значение, то нужен тип возвращаемого значения
    void sayHiWithoutReturn(){
        //...логика
    }
    // если нет возвращаемого значения - указываем метод void
    String sayHiWithReturn(){
        return ("HI");
    }

    // главный метод всего проекта, для запуска всей программы
    // public - модификатор доступа
    // static - работа со статическими данными
    public static void main(String[] args) {
        // пример вызова метода: sayHiWithoutReturn();
        calc(15, 5, '+');
        calc(15, 5, '-');
        calc(15, 5, '*');
        calc(15, 5, '/');
        calc(15, 5, '#');
    }

    /**
     * Calculator example
     * */
    // if else - логический оператор ветвления
    // switch case - логическая конструкция

    static void calc(double a, double b, char operation){
        if(operation == '+') {
            System.out.println(a + b);
        } else if(operation == '-') {
            System.out.println(a - b);
        } else if(operation == '*') {
            System.out.println(a * b);
        } else if(operation == '/') {
            System.out.println(a / b);
        } else {
            System.out.println("Sorry, it's incorrect operation type");
        }
    }
}
