/**
 * 
 */
package com.semika.dao.common.api;

import java.io.Serializable;
import java.util.List;

/**
 * @author root
 *
 */
public interface GenericDAO<T, ID extends Serializable> {
	
	T save(T entity);
	
	void update(T entity);
	
	T findById(ID id, boolean lock);
	 
    List<T> findAll();
 
    void delete(T entity);

}
