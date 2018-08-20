package com.lucianoortizsilva.api;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author lucianoortizsilva@gmail.com
 * @since 2018/08/20
 *
 */
@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {}