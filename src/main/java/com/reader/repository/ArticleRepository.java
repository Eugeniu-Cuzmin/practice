package com.reader.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reader.model.Article;

public interface ArticleRepository extends JpaRepository<Article, Integer>{

}
