package com.example.demo.dao.astro;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.astro.LargeImage;

@Repository
public interface LargeDao extends JpaRepository<LargeImage, Integer>{

}
