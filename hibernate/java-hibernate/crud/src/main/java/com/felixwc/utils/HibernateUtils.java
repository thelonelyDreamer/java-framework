package com.felixwc.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * in order to learn java!
 * created at 2022/7/9 19:24
 *
 * @author felixwc
 */
public class HibernateUtils {
    private static  Configuration CONFIGURATION;
    private static  SessionFactory SESSION_FACTORY;
    private static ThreadLocal<Session> localSessionHolder=new ThreadLocal<>();

    static {
        CONFIGURATION = new Configuration().configure();
        SESSION_FACTORY=CONFIGURATION.buildSessionFactory();
    }

    public static Session obtainSession(){
        Session threadSession=localSessionHolder.get();
        if(null ==SESSION_FACTORY){
            configHibernate();
        }
        if(null ==threadSession || !threadSession.isOpen()){
            threadSession = SESSION_FACTORY.openSession();
            localSessionHolder.set(threadSession);
        }
        return threadSession;
    }

    public static void closeSession(){
        Session session = localSessionHolder.get();
        if(null != session){
            session.close();
            localSessionHolder.remove();
        }
    }

    private static synchronized void configHibernate(){
        if(null==SESSION_FACTORY){
            CONFIGURATION = new Configuration().configure();
            SESSION_FACTORY=CONFIGURATION.buildSessionFactory();
        }
    }
}
