package org.example.OOP;

import org.example.Test.Empty;

import java.util.ArrayList;

public class OOP {
    public static void main(String[] args) {

        Box myBox = new Box(2, 4, 7);
        myBox.setWidth(10.2);
        myBox.setLength(15);
        myBox.setWidth(11.3);

        Box box2 = new Box(1, 5, 9);
        Box box3 = new Box(66, 3, 2);

        box2.setWidth(5);
        box2.setLength(5);
        box2.setHeight(5);
        box3.setHeight(10);
        box3.setLength(10);
        box3.setWidth(10);

        double volume = myBox.getHeight() * myBox.getLength() * myBox.getWidth();
        double volume2 = box2.getHeight() * box2.getWidth() * box2.getLength();
        double volume3 = box3.getHeight() * box3.getWidth() * box3.getLength();
        System.out.println("Объём коробки 1 = " + volume + "\nОбъём коробки 2 = " + volume2 + "\nОбъём коробки 3 = " + volume3);

        Human human = new Human();
        Human human1 = new Human();
        Human human2 = new Human();
        Human human3 = new Human();
        Human human4 = new Human();

        human.age = 24;
        human.name = "Маша";
        human.weight = 54.3;

        human1.age = 12;
        human1.name = "Андрей";
        human1.weight = 45;

        human2.age = 18;
        human2.name = "Никита";
        human2.weight = 74.2;

        human3.age = 27;
        human3.name = "Юля";
        human3.weight = 59;

        human4.age = 38;
        human4.name = "Вася";
        human4.weight = 84.6;

        double avgAge = (double) (human.age + human1.age + human2.age + human3.age + human4.age) / 5;
        System.out.println(avgAge);

        Box box = new Box(10, 15, 20);
        Box box1 = new Box(10, 23, 34);

        box.setLength(5);
        box.setHeight(5);
        box.setWidth(5);

        box1.setLength(10);
        box1.setHeight(10);
        box1.setWidth(10);

        box1.showVolume();
        box.showVolume();
        double volumebox1 = box1.volume();
        double volumebox = box.volume();

        System.out.println(volumebox);
        System.out.println(volumebox1);

        Dog dog = new Dog();
        dog.kind = "Гончая";
        dog.name = "Ракета";
        dog.speed = 5;
        dog.run();
        System.out.println(dog.info());

        Box box4 = new Box(1, 22, 14);
        box4.setDimens(15, 15, 15);
        System.out.println(box4.volume());

        Rect rect = new Rect();
        rect.setParams(4.6, 6);
        System.out.println(rect.perimeter());
        System.out.println(rect.square());

        Box box5 = new Box(10, 15, 20);
        System.out.println(box5.volume());

        Worker worker = new Worker("Иван", "Дизайнер", 120000);
        worker.getInfo(12);


        int result = Test.multiple(5);
        System.out.println(result);

        Box box6 = new Box(10);
        Box box7 = new Box(15, 20, 25);
        box6.showVolume();
        box7.showVolume();
        Box box8 = new Box();
        box8.showVolume();
        box6.compare(box7);

        Box box9 = new Box(box8);
        box8.setDimens(100, 100, 100);
        int result1 = box9.compare(box8);
        switch (result1) {
            case -1:
                System.out.println("Наша коробка меньше");
                break;
            case 1:
                System.out.println("Наша коробка больше");
                break;
            case 0:
                System.out.println("Наши коробки равны");
                break;
        }
        Box box10 = box9.increase(2);
        box9.setDimens(10, 10, 10);
        box9.showVolume();
        box10.showVolume();

        Box box11 = new Box(10);
        Box box12 = new Box(10, 15, 20);
        Box box13 = box11.sumBox(box12);
        Box box14 = new Box(box11, box13);
        box11.showVolume();
        box12.showVolume();
        box13.showVolume();
        double volumeSum = box11.volume() + box13.volume();
        System.out.println("box11 + box13 = " + volumeSum);
        box14.showVolume();
        System.out.println(box);

        BoxWeight boxWeight = new BoxWeight(2, 3, 4, 8);
        boxWeight.showInfo();
        BoxWeight boxWeight1 = new BoxWeight(3);
        boxWeight1.showInfo();
        BoxWeight boxWeight2 = new BoxWeight(4, 12);
        boxWeight2.showInfo();


        Monster monster = new Monster();
        monster.voice();
        monster.voice(8);
        monster.voice(4);

        Monster monster1 = new Monster(4);
        monster1.voice();
        monster1.voice(8);
        monster1.voice(4, "Берсерк");

        Monster monster2 = new Monster(5, 4);
        monster2.voice();
        monster2.voice(8);
        monster2.voice(2, "Цербер");

        Monster monster3 = new Monster(2, 5, 6);
        monster3.voice();
        monster3.voice(8);
        monster3.voice(5, "Вервульф");

        Man man = new Man("Иван", 27);
        System.out.println(man.getAge());
        System.out.println(man.getName());

        int square = MyMath.square(20);
        System.out.println(square);
        double length = MyMath.length(10);
        System.out.println(length);
        double area = MyMath.area(10);
        System.out.println(area);
        length = MyMath.length(10);
        System.out.println(length);

        int sum = MyMath.sum(1);
        System.out.println(sum);

        String[] employees = {
                "Никита",
                "Игорь",
                "Ольга",
                "Вася",
                "Макс"
        };
        String[] second = new String[employees.length + 1];
        for (int i = 0; i < employees.length; i++) {
            second[i] = employees[i];
        }
        second[second.length - 1] = "Иван";
        employees = second;
        employees[1] = null;
        String[] newNames = new String[employees.length - 1];
        for (int i = 0, j = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                newNames[j] = employees[i];
                j++;
            }
        }
        employees = newNames;
        for (String name : employees) {
            System.out.println(name);
        }

        Collections employee = new Collections();
        employee.add("Никита");
        employee.add("Игорь");
        employee.add("Ваня");
        employee.add("Дима");
        employee.add("Лена");
        employee.add("Света");
        employee.remove("Ваня");
        employee.remove("Рома");
        for (int i = 0; i < employee.getSize(); i++) {
            System.out.println(employee.get(i));
        }

        Cat cat = new Cat();
        Lion lion = new Lion();
        System.out.println(lion.getEars());
        System.out.println(cat.getLegs());
        cat.showInfo();
        lion.showInfo();
        cat.eat();
        lion.eat();

        Rectangle rectangle = new Rectangle(2, 6);
        System.out.println(rectangle.square());
        Triangle triangle = new Triangle(2, 5, 8);
        System.out.println(triangle.square());
        ColorRect colorRect = new ColorRect(2, 5);
        System.out.println(colorRect.square());


        Dogg dogg1 = new Dogg();
        Dogg dogg2 = new Dogg();
        Dogg dogg3 = new Dogg();
        Catt catt1 = new Catt();
        Bird bird = new Bird();
        ArrayList<CanRun> animals = new ArrayList<>();
        animals.add(dogg1);
        animals.add(catt1);
        animals.add(bird);
        animals.add(dogg1);
        animals.add(dogg2);
        for (CanRun animal : animals) {
            animal.run();
        }
        CanRun canRun = dogg3;
        dogg3 = (Dogg) canRun;
        dogg3.eat();
        Flyable flyable = new Bird();
        flyable.fly();

        Programmer programmer = new Programmer("Игорь");
        Programmer programmer1 = new Programmer("Андрей");
        Programmer programmer2 = new Programmer("Гена");
        Driver driver = new Driver("Миша");
        Driver driver1 = new Driver("Петя");
        Driver driver2 = new Driver("Дима");
        Cook cook = new Cook("Света");
        Cook cook1 = new Cook("Таня");
        Cook cook2 = new Cook("Оля");

        ArrayList<Workerr> workerrs = new ArrayList<>();
        workerrs.add(programmer1);
        workerrs.add(programmer);
        workerrs.add(programmer2);

        workerrs.add(driver);
        workerrs.add(driver1);
        workerrs.add(driver2);

        workerrs.add(cook);
        workerrs.add(cook1);
        workerrs.add(cook2);
        for (Workerr workerr : workerrs) {
            workerr.voice();
        }

        ArrayList<CanCode> programmers = new ArrayList<>();
        programmers.add(programmer1);
        programmers.add(programmer2);
        programmers.add(programmer);
        for (CanCode programer : programmers) {
            programer.code();
        }

        ArrayList<CanDrive> drivers = new ArrayList<>();
        drivers.add(driver1);
        drivers.add(driver2);
        drivers.add(driver);
        for (CanDrive driverr : drivers) {
            driverr.drive();
        }

        ArrayList<CanCook> cookers = new ArrayList<>();
        cookers.add(cook);
        cookers.add(cook1);
        cookers.add(cook2);
        for (CanCook cookk : cookers) {
            cookk.cook();
        }

        Director director = new Director();

        director.force(new Cookable() {
            @Override
            public void cook() {
                System.out.println("Готовлю");
            }
        });

        Director director1 = new Director();
        director1.force1(new Counter() {
            @Override
            public String result(int months) {
                return "Отчет за " + months + " месяцев";
            }
        }, 9);

        Empty empty = new Empty();
        empty.toString();
        System.out.println(empty);


        int result2 = (int) (Math.random() * 6 + 1);
        System.out.println(result);

    }
}
