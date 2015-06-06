/**
 * 
 */
package com.semika.dao.common.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.LockMode;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.semika.dao.common.api.GenericDAO;

/**
 * @author root
 *
 */
public class GenericHibernateDAO<T, ID extends Serializable> extends HibernateDaoSupport implements GenericDAO<T, ID> {

	private Class<T> persistentClass;

	@SuppressWarnings("unchecked")
	public GenericHibernateDAO() {
	        this.persistentClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}

	public Class<T> getPersistentClass() {
	        return persistentClass;
	}
	 
	public List<T> findAll() {
		return getHibernateTemplate().loadAll(getPersistentClass()); 
	}

	public T findById(ID id) {
        T entity = (T) getHibernateTemplate().load(getPersistentClass(), id);
        return entity;
	}

	public T save(T entity) {
		getHibernateTemplate().save(entity);
		return entity;
	}

	public void update(T entity) {
		getHibernateTemplate().update(entity);
	}

	public T findById(ID id, boolean lock) {
		T entity;
        if (lock) {
        	entity = (T) getHibernateTemplate().load(getPersistentClass(), id, LockMode.UPGRADE);
        } else {
        	entity = (T) getHibernateTemplate().load(getPersistentClass(), id);
        }
        return entity;
	}

	public void delete(T entity) {
		getHibernateTemplate().delete(entity);
	}

}
