public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println("\nЗадача №2");
        dog = dog + 4;
         cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println("\nЗадача №3");
     dog = dog - 3.5;
     cat = cat - 1.6;
       paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println("\nЗадача №4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        System.out.println("\nЗадача №5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        System.out.println("\nЗадача №6");
var weightBoxer1 = 78.2;
var weightBoxer2 = 82.7;
var allWeightBoxers = weightBoxer1 + weightBoxer2;
        System.out.println("Вес первого боксера " + weightBoxer1 + " кг");
        System.out.println("Вес второго боксера " + weightBoxer2 + " кг");
        System.out.println("Вес двух боксеров " + allWeightBoxers + " кг");
        var weightDifference = weightBoxer2 - weightBoxer1;
        System.out.println("Разница в весе боксеров " + weightDifference + " кг");

        // Задача Найти остаток от деления между двумя весами. Как я понял , придумываем новые имена переменным ?
        System.out.println("\nЗадача №7");
     var a = 33;
     var b = 21;
     var remainder = a % b;

        System.out.println("Остаток равен " + remainder);
        System.out.println("\nЗадача №8" );
        System.out.println("(1) 640 часов работы поделено между сотрудниками. \nЕсли каждый сотрудник посвящает работе 8 часов, то сколько всего работников в компании? \n(2) Посчитайте, сколько часов работы должно быть поделено между сотрудниками, если в компании работает на 94 человека больше.   ");
var hours = 640;
var hoursPerPerson = 8;
var numberOfPeople = hours / hoursPerPerson;
        System.out.println("\nКоличесто сотрудников " + numberOfPeople);
      numberOfPeople = numberOfPeople + 94;
    hoursPerPerson = hours / numberOfPeople;
        System.out.println("\nВ случае если количество сотрудников увеличится на 94 человека, то \nна одного сотрудника, приходится по " + hoursPerPerson + " часов работы.");
// Надеюсь все верно, слегка по своевольничал. :)
    }
}