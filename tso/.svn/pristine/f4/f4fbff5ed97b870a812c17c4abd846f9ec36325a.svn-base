package com.ly.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class BaseDao {

	@Autowired
	private SessionFactory sessionFactory;

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public List queryManyWhere(String entityName, List propertyName, List value, List operator) {
		List<Object> params = new ArrayList<Object>();// hibernate参数
		StringBuffer hql = new StringBuffer("from " + entityName + " where 1=1");
		for (int i = 0; i < propertyName.size(); i++) {
			if (value.get(i) != null && !value.get(i).toString().isEmpty()) {
				hql.append(" and " + propertyName.get(i) + " " + operator.get(i) + " ?");
				// like查询要加%
				if (operator.get(i).toString().toLowerCase().equals("like")) {
					params.add("%" + value.get(i).toString() + "%");
				} else {
					params.add(value.get(i).toString());
				}
			}
		}
		Query query = getSession().createQuery(hql.toString());
		// 给?赋值
		for (int i = 0; i < params.size(); i++) {
			query.setParameter(i, params.get(i));
		}
		return query.list();
	}

}
