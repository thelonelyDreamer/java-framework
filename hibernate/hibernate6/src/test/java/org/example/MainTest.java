package org.example;

import org.example.pojo.KV;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MainTest {

    @Before
    public void setUp() throws Exception {
        System.out.println("setup");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("teardown");
    }
    @Test
    public void test() {
        System.out.println("test");
    }

    @Test
    public void testMain(){
        System.out.println("maintest");
    }


    @Test
    public void testHibernate(){
        //Hibernate 加载核心配置文件（有数据库连接信息）
        Configuration configuration = new Configuration().configure();
        //创建一个 SessionFactory 用来获取 Session 连接对象
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        try{
            // 获取session
            KV kv = new KV();
            kv.setKey("kv2");
            kv.setValue("kvv");
            //提交事务
            session.save(kv);
            System.out.println(session.get(KV.class,"kv2"));
            transaction.commit();
        }catch (Exception e){
            // 回滚
            transaction.rollback();
        }finally {
            //关闭session
            session.close();
        }
        sessionFactory.close();
    }
}