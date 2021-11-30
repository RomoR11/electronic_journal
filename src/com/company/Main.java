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

        Leaner[] Learners3 = new Leaner[2];
        Learners3[0] = L;
        Learners3[1] = L3;

        Elective e = new Elective("Профильная матиматика", Learners3, T);

        Participant p = new Participant(0101, "Агафонов Валентин Игнатьевич", 354389821);

        C.getList();
        C.getListParents();
        e.getList();
        e.getListParents();
        S.getList();
        S.getListParents();
        S1.getList();
        S1.getListParents();

        Employee[] Employees = new Employee[3];
        Employees[0] = E;
        Employees[1] = E1;
        Employees[2] = E2;

        Teacher[] Teachers = new Teacher[3];
        Teachers[0] = T;
        Teachers[1] = T1;
        Teachers[2] = T2;

        Class[] Classes = new Class[1];
        Classes[0] = C;

        Elective[] Electives = new Elective[1];
        Electives[0] = e;

        Section[] Sections = new Section[2];
        Sections[0] = S;
        Sections[1] = S1;



        School s = new School(Employees, Teachers, Learners, "Некрасова 9", "МБОУ ПТЛ", Classes, Electives, Sections);
        s.getListEmployers();
        s.getListLearners();
        s.getListTeachers();
        s.getParticipants(1112);

    }
}
