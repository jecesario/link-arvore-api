package com.gen.linkarvore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gen.linkarvore.models.Views;

@Repository
public interface ViewsRepository extends JpaRepository<Views, Integer>{

}
