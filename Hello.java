package com.cjc.model;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.cjc.model.Student;
import com.cjc.model.HibernateUtil;

public class TestApp {

    public static void main(String[] args) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        Student s = new Student();
        s.setName("Satish");
        s.setRollno(111);
        s.setAddress("Wani");

        session.save(s);

        tx.commit();
        session.close();

        System.out.println("Data inserted successfully");
    }
}
