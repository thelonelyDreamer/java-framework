package com.felixwc.pojo;

import com.felixwc.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

public class StudentTest {
    @Test
    public void many2one() {
        Session session = null;
        Transaction transaction = null;
        try {
            session = HibernateUtils.obtainSession();
            transaction = session.beginTransaction();
            Grade grade1 = new Grade().setId(1).setName("初级");
            Grade grade2 = new Grade().setId(2).setName("中级");
            session.save(grade1);
            session.save(grade2);
            Student shine = new Student().setId(1).setName("shine").setAge(12).setGrade(grade1);
            Student sunshine = new Student().setId(2).setName("sunshine").setAge(12).setGrade(grade1);
            Student tom = new Student().setId(3).setName("tom").setAge(18).setGrade(grade2);
            session.save(shine);
            session.save(sunshine);
            session.save(tom);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
        } finally {
            HibernateUtils.closeSession();
        }
    }

    @Test
    public void query(){
        Session session = HibernateUtils.obtainSession();
        Student student = new Student();
        student.setId(1).setAge(18).setName("shine");
        session.save(student);
        HibernateUtils.closeSession();
        session = HibernateUtils.obtainSession();
        Student student1 = session.get(Student.class, 1);
        System.out.println(student1);
        System.out.println(student1==student);
    }
}