package topic_3.topic_3_2;

public class Main {
    public static void main(String[] args) {
        //    Створити клас, який представляє навчальний клас ClassRoom. Створіть клас учень Pupil.
//    У тілі класу створіть методи void study(), void read(), void write(), void relax().
//    Створіть 3 похідні класу ExcelentPupil, GoodPupil, BadPupil від класу базового класу Pupil і перевизначте кожен із методів,
//    залежно від успішності учня. Конструктор класу ClassRoom приймає аргументи типу Pupil, клас має складатися із 4 учнів.
//    Передбачте можливість, що користувач може передати 2 або 3 аргументи. Виведіть інформацію про те, як усі учні екземпляра класу ClassRoom
//    вміють навчатися, читати, писати, відпочивати.

        Pupil excelentPupil1 = new ExcelentPupil();
        Pupil goodPupil1 = new GoodPupil();
        Pupil goodPupil2 = new GoodPupil();
        Pupil badPupil1 = new BadPupil();

        ClassRoom classroom1 = new ClassRoom(excelentPupil1, goodPupil1, goodPupil2, badPupil1);
        classroom1.academicPerformance();

    }
}
