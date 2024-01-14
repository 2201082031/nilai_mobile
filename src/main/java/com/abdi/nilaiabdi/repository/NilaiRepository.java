/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abdi.nilaiabdi.repository;

import com.abdi.nilaiabdi.entity.Nilai;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author M.ABDI
 */
@Repository
public interface NilaiRepository extends JpaRepository<Nilai, Long>{
    
}
