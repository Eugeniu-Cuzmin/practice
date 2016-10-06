package com.reader.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.reader.model.Article;
import com.reader.repository.ArticleRepository;
import com.reader.service.ArticleService;

@Service
public class ArticleServiceImpl implements ArticleService{

	@Resource
	private ArticleRepository articleRepository;
	
	@Override
	@Transactional
	public Article addArticle(Article article) {
		return articleRepository.save(article);
	}
	
	@Override
	public List<Article> findAll() {
		return articleRepository.findAll();
	}

	

}
