package oop2less4hw;

import oop2less4hw.controller.TeacherController;

public class Main {

    public static void main(String[] args) {
        TeacherController teacherController = new TeacherController();
        teacherController.create("Варгин", "Алексей", "Петрович");
        teacherController.create("Егоров", "Константин", "Артемович");
        teacherController.create("Шумилов", "Евгений", "Егорович");
        teacherController.create("Джохаридзе", "Сергей", "Олегович");
        teacherController.printTeachers();
        System.out.println("Меняем учителя с TeacherID = 2");
        teacherController.editTeacher(2, "Иванов", "Алексей", "Порфирьевич");
        teacherController.printTeachers();

    }
}
