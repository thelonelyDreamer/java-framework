package com.felixwc.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * in order to learn java!
 * created at 2022/7/9 19:24
 *
 * @author felixwc
 */
public class HibernateUtils {
    private static final Configuration CONFIGURATION;
    private static final SessionFactory SESSION_FACTORY;

    static {
        CONFIGURATION = new Configuration().configure();
        SESSION_FACTORY=CONFIGURATION.buildSessionFactory();
    }

}
