package com.aartek.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.aartek.model.Registration;

@Repository
@SuppressWarnings("unused")
public class RegistrationRepository {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public Registration saveTheData(Registration registration)
	{
		if(registration != null)
		{ 
			hibernateTemplate.saveOrUpdate(registration);
		return registration;
		}
		else
			return null;
		
	}
	

}
