package org.springframework.kdb.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

@Repository
public class SimpleKDBRepository<T, ID> implements KDBRepository<T, ID> {
    @Override
    public Iterable<T> findAll(Sort sort) {
        return null;
    }
    
    @Override
    public Page<T> findAll(Pageable pageable) {
        return null;
    }
    
    @Override
    public <S extends T> S save(S s) {
        return null;
    }
    
    @Override
    public <S extends T> Iterable<S> save(Iterable<S> iterable) {
        return null;
    }
    
    @Override
    public T findOne(ID id) {
        return null;
    }
    
    @Override
    public boolean exists(ID id) {
        return false;
    }
    
    @Override
    public Iterable<T> findAll() {
        return null;
    }
    
    @Override
    public Iterable<T> findAll(Iterable<ID> iterable) {
        return null;
    }
    
    @Override
    public long count() {
        return 0;
    }
    
    @Override
    public void delete(ID id) {
    
    }
    
    @Override
    public void delete(T t) {
    
    }
    
    @Override
    public void delete(Iterable<? extends T> iterable) {
    
    }
    
    @Override
    public void deleteAll() {
    
    }
}
