package org.springframework.kdb.repository;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.io.Serializable;

@NoRepositoryBean
public interface KDBRepository<T, ID extends Serializable> extends PagingAndSortingRepository<T, ID> {
}
