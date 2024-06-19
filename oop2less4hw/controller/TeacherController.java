package oop2less4hw.controller;

import java.util.List;
import oop2less4hw.model.Teacher;
import oop2less4hw.service.TeacherService;
import oop2less4hw.view.TeacherView;

public class TeacherController implements UserController<Teacher> {

    private final TeacherService teacherService;
    private final TeacherView teacherView;

    public TeacherController() {
        this.teacherService = new TeacherService();
        this.teacherView = new TeacherView();
    }

    @Override
    public void create(String lastName, String firstName, String middleName) {
        teacherService.create(lastName, firstName, middleName);
    }

    public void editTeacher(Integer teacherId, String lastName, String firstName, String middleName) {
        teacherService.editTeacher(teacherId, lastName, firstName, middleName);
    }

    public void initTeacherList(List<Teacher> list) {
        teacherService.initData(list);
    }

    public void printTeachers() {
        teacherView.sendOnConsole(teacherService.getAll());
    }
}
