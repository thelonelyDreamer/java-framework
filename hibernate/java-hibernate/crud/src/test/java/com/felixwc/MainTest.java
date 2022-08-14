package com.felixwc;

import com.felixwc.pojo.Grade;
import com.felixwc.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

public class MainTest {

    @Test
    public void test(){
        Session session =null;
        Transaction tx = null;
        try{
            session = HibernateUtils.obtainSession();
            tx = session.beginTransaction();

            Grade grade1 = session.get(Grade.class, 1);
            System.out.println(grade1);
            tx.commit();
        }catch (Exception e){
            e.printStackTrace();
            tx.rollback();
        }finally {
            HibernateUtils.closeSession();
        }
    }
}