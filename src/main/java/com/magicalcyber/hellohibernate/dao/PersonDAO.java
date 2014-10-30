package com.magicalcyber.hellohibernate.dao;

import com.magicalcyber.hellohibernate.domain.Person;
import com.magicalcyber.hellohibernate.util.HibernateUtil;
import org.hibernate.Session;

import java.util.List;

/**
 * Created by MagicalCyber on 10/30/2014.
 */
public class PersonDAO {
    private Session session;

    public PersonDAO() {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
    }

    public List<Person> listPerson(){
        List list = session.createCriteria(Person.class).list();
        return list;
    }

    public void save(String name){
        Person person = new Person();
        person.setName(name);
        session.save(person);
    }
}
