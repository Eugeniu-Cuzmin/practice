package com.reader.service;

import java.util.List;

import com.reader.model.Article;

public interface ArticleService {
	public List<Article> findAll();

	public Article addArticle(Article article);
}
