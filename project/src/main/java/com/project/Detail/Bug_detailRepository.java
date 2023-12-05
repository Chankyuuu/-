package com.project.Detail;

import java.util.List;//

import org.springframework.data.jpa.repository.JpaRepository;

public interface Bug_detailRepository extends JpaRepository<Bug_detail, Integer>{
    List<Bug_detail> findByNameContainingOrDetailContaining(String name, String detail);//
}
