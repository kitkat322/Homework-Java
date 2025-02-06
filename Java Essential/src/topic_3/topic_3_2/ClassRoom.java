package topic_3.topic_3_2;

public class ClassRoom {
//    Створити клас, який представляє навчальний клас ClassRoom. Створіть клас учень Pupil.
//    У тілі класу створіть методи void study(), void read(), void write(), void relax().
//    Створіть 3 похідні класу ExcelentPupil, GoodPupil, BadPupil від класу базового класу Pupil і перевизначте кожен із методів,
//    залежно від успішності учня. Конструктор класу ClassRoom приймає аргументи типу Pupil, клас має складатися із 4 учнів.
//    Передбачте можливість, що користувач може передати 2 або 3 аргументи. Виведіть інформацію про те, як усі учні екземпляра класу ClassRoom
//    вміють навчатися, читати, писати, відпочивати.

    private Pupil pupil1, pupil2, pupil3, pupil4;

    public ClassRoom(Pupil pupil1, Pupil pupil2, Pupil pupil3, Pupil pupil4){
        this.pupil1 = pupil1;
        this.pupil2 = pupil2;
        this.pupil3 = pupil3;
        this.pupil4 = pupil4;
    }
    public ClassRoom(Pupil pupil1, Pupil pupil2, Pupil pupil3){}
    public ClassRoom(Pupil pupil1, Pupil pupil2){}

        //static
     public void academicPerformance() {
         Pupil[] classroom = { pupil1, pupil2, pupil3, pupil4 } ;
         for (Pupil temp : classroom){
            temp.study();
            temp.read();
            temp.write();
            temp.relax();
            System.out.println("=======================");
        }
    }
}

































