package com.seguni.seguni.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.seguni.seguni.entity.Perito;

@Repository("peritoRepository")
public interface PeritoRepository extends JpaRepository <Perito, Serializable>{

}
