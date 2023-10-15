package org.example.OOP;

public class OOP {
    public static void main(String[] args) {

        Box myBox = new Box(2, 4, 7);
        myBox.height = 10.2;
        myBox.length = 15;
        myBox.width = 11.3;

        Box box2 = new Box(1, 5, 9);
        Box box3 = new Box(66, 3, 2);

        box2.width = 5;
        box2.length = 5;
        box2.height = 5;
        box3.height = 10;
        box3.length = 10;
        box3.width = 10;

        double volume = myBox.height * myBox.length * myBox.width;
        double volume2 = box2.height * box2.width * box2.length;
        double volume3 = box3.height * box3.width * box3.length;
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

        box.length = 5;
        box.height = 5;
        box.width = 5;

        box1.length = 10;
        box1.height = 10;
        box1.width = 10;

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

    }
}
