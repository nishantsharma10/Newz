package com.stackroute.newz.repository;

import java.util.List;

import com.stackroute.newz.model.News;

public interface NewsRepositoryImpl {
	public List<News> getNewList();
	public void setNewsList(List<News> newsList);
	public void addNews(News news);
	public List<News> getAllNews();
	public boolean deleteNews(int newsId);
	
	
	
	

}
