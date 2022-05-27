package com.example.demowebapi.repositorys;

import com.example.demowebapi.models.article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface articleRepository extends JpaRepository<article, Long> {
}
