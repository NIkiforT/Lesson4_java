package com.company;

import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {

        //строим массив сотрудников
        Workers[] persArr = new Workers[5];
        persArr[0] = new Workers("Ivan", "Пожарный", "ii@mail.ru", 89435455, 32000, 21);
        persArr[1] = new Workers("Misha", "Инженер", "fdg@mail.ru", 894563455, 30000, 24);
        persArr[2] = new Workers("Irina", "Медсестра", "dfg5y@mail.ru", 894435455, 56000, 29);
        persArr[3] = new Workers("Niki", "Садовник", "sdfg346@mail.ru", 1943534455, 55000, 25);
        persArr[4] = new Workers("Max", "Водитель", "ffde@mail.ru", 1949995455, 13000, 41);


        //выводим инфу о сотрудниках, кому за 40.
        for (int i = 0; i < persArr.length; i++){
            if(persArr[i].age > 40) {
                persArr[i].workersInfo();
            }
        }
    }

    Cat cat1 = new Cat();

}
