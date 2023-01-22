package com.felixwc;

import com.felixwc.pojo.Grade;
import com.felixwc.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Session session = HibernateUtils.obtainSession();
        Transaction transaction = session.beginTransaction();

        try {
            for (int i = 0; i < 10; i++) {
                Grade grade = new Grade();
                grade.setName("grade"+i);
                session.save(grade);
            }
            transaction.commit();
        }catch (Exception e){
            transaction.rollback();
        }
        session.close();
        session = HibernateUtils.obtainSession();
        String hql="from Grade where id=3";//from 实体类类型名称
        Query query = session.createQuery(hql);
        List<Grade> list = query.list();
        for (Grade user : list) {
            System.out.println(user);
        }
        System.out.println("helloworld");
        String sql = "select id,name from grade";
        list = session.createSQLQuery(sql).addEntity(Grade.class).list();
        NativeQuery sqlQuery = session.createSQLQuery(sql);


        for(Grade obj : list){
            System.out.println(obj);
        }
    }
}