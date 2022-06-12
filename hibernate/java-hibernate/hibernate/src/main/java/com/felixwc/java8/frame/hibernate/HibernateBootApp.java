package com.felixwc.java8.frame.hibernate;

import com.felixwc.java8.frame.hibernate.pojo.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * in order to learn java!
 * created at 2022/1/30 02:56
 *
 * @author wangchao
 */
public class HibernateBootApp {
    public static void main(String[] args) {
        Configuration configure = new Configuration().configure();
        SessionFactory sessionFactory = configure.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Person person = new Person();
        person.setName("123");
        person.setWeight(12.33);
        person.setId(1);
        session.save(person);
        session.beginTransaction().commit();
        session.close();
    }
}
