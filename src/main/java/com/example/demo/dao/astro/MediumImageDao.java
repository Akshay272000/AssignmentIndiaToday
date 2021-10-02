package com.example.demo.dao.astro;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.astro.MediumImage;

@Repository
public interface MediumImageDao extends JpaRepository<MediumImage, Integer> {

}
