package com.company;

public class Main {

    public static void main(String[] args) {
        Teacher T = new Teacher("учитель математики", "лучший математик", 1111, 763571623, "Максим Юрьевич");
        Teacher T2 = new Teacher("социальный педагог", "лучший классный руководитель", 1113, 76357993, "Юлия Дмитриевна");
        Teacher T1 = new Teacher("учитель английского", "лучший учитель англйского", 1112, 713551823, "Анна Галковская");
        Parent P = new Parent("Ержанов Алексей Михайлович", 87526374);
        Parent P1 = new Parent("Ержанова Алевтина Олеговна", 89462712);
        Parent P2 = new Parent("Шарапов Адам Тарасович", 875837274);
        Parent P3 = new Parent("Гришина Арьяна Христофоровна", 872740374);
        Parent P4 = new Parent("Громов Илья Дамирович", 875190374);
        Parent P5 = new Parent("Морозова Милана Святославовна", 875257394);

        Parent[] Parents = new Parent[2];
        Parents[0] = P;
        Parents[1] = P1;
        Parent[] Parents1 = new Parent[2];
        Parents1[0] = P2;
        Parents1[1] = P3;
        Parent[] Parents2 = new Parent[2];
        Parents2[0] = P4;
        Parents2[1] = P5;

        Leaner L = new Leaner(0001, 84564736, "Ержанов Влад Алексеевич", Parents);
        Leaner L1 = new Leaner(0002, 845402736, "Шарапов Тарас Адамович", Parents1);
        Leaner L2 = new Leaner(0003, 845501736, "Громов Дамир Ильич", Parents2);
        Leaner L3 = new Leaner(0004, 845569736, "Громов Ормунокалинбек Ильич", Parents2);

        Leaner[] Learners = new Leaner[4];
        Learners[0] = L;
        Learners[1] = L1;
        Learners[2] = L2;
        Learners[3] = L3;

        Class C = new Class("81 группа", T2, Learners);

        Employee E = new Employee("охранник", 1120, 785738282, "Мясников Вячеслав Владимирович");
        Employee E1 = new Employee("Уборщица", 1130, 782647282, "Фёдорова Мериса Парфеньевна");
        Employee E2 = new Employee("Повар", 1130, 785438982, "Бобров Григорий Игоревич");

        Leaner[] Learners1 = new Leaner[2];
        Learners1[0] = L1;
        Learners1[1] = L3;
        Leaner[] Learners2 = new Leaner[2];
        Learners2[0] = L;
        Learners2[1] = L2;

        Section S = new Section("Весёлая математика", Learners1, T);
        Section S1 = new Section("British Bulldog", Learners2, T1);

    }
}
