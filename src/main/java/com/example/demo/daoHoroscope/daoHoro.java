package com.example.demo.daoHoroscope;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.horoscope_json.allHoroscope;

@Repository
public interface daoHoro extends JpaRepository<allHoroscope, Integer> {

}
