package com.tyss.esslite.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import javax.transaction.Transaction;

import org.springframework.stereotype.Repository;

import com.tyss.esslite.dto.ItemsDTO;
import com.tyss.esslite.dto.SkillDTO;
import com.tyss.esslite.dto.TechnologyDTO;
import com.tyss.esslite.dto.TechnologyLookUpDTO;

@Repository
public class EmployeeDAOImp implements EmployeeDAO {
	@PersistenceUnit
	private EntityManagerFactory factory;
	@PersistenceContext
	private EntityManager entitymanager;

	@Override
	public TechnologyDTO fetchById(String employeeid) {
		// TODO Auto-generated method stub
		ItemsDTO itemsdto = new ItemsDTO();
		Query query = entitymanager.createQuery(
				" select t.rating from TechnologyDTO as t inner join SkillDTO as s on s.skillid = t.skillid inner join TechnologyLookUpDTO tl  on tl.techid = s.techid where employeeid =:employeeid");
		Query query1 = entitymanager.createQuery(
				" select s.skilldesc from TechnologyDTO as t inner join SkillDTO as s on s.skillid = t.skillid inner join TechnologyLookUpDTO tl  on tl.techid = s.techid where employeeid =:employeeid");

		System.out.println(employeeid);
		query.setParameter("employeeid", employeeid);
		query1.setParameter("employeeid", employeeid);
		System.out.println("employeeid");
		List<TechnologyDTO> list = query.getResultList();
		List<SkillDTO> list1 = query1.getResultList();
		System.out.println("hiiii alert");
		System.out.println(list);
		System.out.println(list1);

		System.out.println("hello not entering into list");

		if (list != null) {

			System.out.println("hello after entering list");
			System.out.println(list);
			return (TechnologyDTO) list;
		} else {
			System.out.println("hey false is trie");
			System.out.println(list.get(0));
			return list.get(0);
		}

	}

}
