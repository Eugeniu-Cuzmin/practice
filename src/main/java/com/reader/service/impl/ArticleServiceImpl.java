package com.reader.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.reader.model.Article;
import com.reader.repository.ArticleRepository;
import com.reader.service.ArticleService;

@Service
public class ArticleServiceImpl implements ArticleService{

	@Resource
	private ArticleRepository articleRepository;
	
	@Override
	public List<Article> findAll() {
		return articleRepository.findAll();
	}

}
