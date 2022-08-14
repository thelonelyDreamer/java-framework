package org.example.pojo.p33;

import org.example.dao.p33.StudentDao;
import org.example.dao.p33.TeacherDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.Optional;

@SpringBootTest
class StudentTest {
    @Autowired
    private TeacherDao teacherDao;
    @Autowired
    private StudentDao studentDao;

    @Test
    public void test(){
        Student s1 = new Student();
        Student s2 = new Student();
        studentDao.save(s1);
        studentDao.save(s2);
        Teacher t1 = new Teacher();
        Teacher t2 = new Teacher();
        HashSet<Student> students = new HashSet<>();
        students.add(s1);
        students.add(s2);
        t1.setStudents(students);
        t2.setStudents(students);
        teacherDao.save(t1);
        teacherDao.save(t2);
    }

    @Test
    @Transactional
    public void getStudentAndTeacher(){
        test();
        Optional<Teacher> teacher = teacherDao.findById(2);
        System.out.println(teacher);
        Optional<Student> student = studentDao.findById(2);
        System.out.println(student);
    }
}