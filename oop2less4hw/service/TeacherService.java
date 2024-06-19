package oop2less4hw.service;

import java.util.ArrayList;
import java.util.List;
import oop2less4hw.model.Teacher;

public class TeacherService implements UserService<Teacher> {

    private List<Teacher> teacherList;
    private Integer maxTeacherId;

    public TeacherService() {
        this.teacherList = new ArrayList<>();
        this.maxTeacherId = -1;
    }

    @Override
    public List<Teacher> getAll() {
        return teacherList;
    }

    @Override
    public void initData(List<Teacher> list) {
        this.teacherList = list;
        maxTeacherId = getNewMaxTeacherId();
    }

    @Override
    public void create(String lastName, String firstName, String middleName) {
        Teacher teacher = new Teacher(++maxTeacherId, lastName, firstName, middleName);
        teacherList.add(teacher);
    }

    public void editTeacher(Integer teacherId, String lastName, String firstName, String middleName) {
        for (Teacher teacher : teacherList) {
            if (teacher.getTeacherId().equals(teacherId)) {
                teacher.setLastName(lastName);
                teacher.setFirstName(firstName);
                teacher.setMiddleName(middleName);
            }
        }
    }

    private Integer getNewMaxTeacherId() {
        Integer result = teacherList.get(0).getTeacherId();
        for (Teacher teacher : teacherList) {
            if (result < teacher.getTeacherId()) {
                result = teacher.getTeacherId();
            }
        }
        return result;
    }
}
