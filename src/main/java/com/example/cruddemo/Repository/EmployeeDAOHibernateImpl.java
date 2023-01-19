package com.example.cruddemo.Repository;

import com.example.cruddemo.entity.Employee;
import com.example.cruddemo.DAO.EmployeeDAO;
import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class EmployeeDAOHibernateImpl implements EmployeeDAO {
    private EntityManager entityManager;


    @Autowired
    public EmployeeDAOHibernateImpl(EntityManager theEntityManager){
        entityManager = theEntityManager;
    }

    @Override
    @Transactional
    public List<Employee> findAll() {
        //get the current hibernate session
        Session currentSession = entityManager.unwrap(Session.class);


        //create a query
        Query<Employee> theQuery = currentSession.createQuery("from Employee",Employee.class);

        //execute query and get result list
        List<Employee> employees = theQuery.getResultList();

        //return the results
        return employees;
    }
}
