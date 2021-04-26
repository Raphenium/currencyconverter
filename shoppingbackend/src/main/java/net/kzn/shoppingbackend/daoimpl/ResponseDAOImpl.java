package net.kzn.shoppingbackend.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.kzn.shoppingbackend.dao.ResponseDAO;
import net.kzn.shoppingbackend.dto.Response;


@Repository("responseDAO")
@Transactional
public class ResponseDAOImpl implements ResponseDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Response> list() {
		return sessionFactory
				.getCurrentSession()
					.createQuery("FROM Response" , Response.class)
						.getResultList();
	}

}
