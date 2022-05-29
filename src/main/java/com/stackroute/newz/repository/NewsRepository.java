package com.stackroute.newz.repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.stackroute.newz.model.News;


/*
 * Annotate the class with @Repository annotation. 
 * This class contains the code for data storage interactions and methods 
 * of this class will be used by other parts of the applications such
 * as Controllers and Test Cases
 * */
@Repository
public class NewsRepository implements NewsRepositoryImpl {
	
	/* Declare a variable called "newsList" to store all the news. */
    private List<News> newsList=new ArrayList<News>();
    

    public NewsRepository() {
    	
    	/* Initialize the variable using proper data type */
    }
    

	@Override
	public List<News> getNewList() {
		// TODO Auto-generated method stub
		return newsList;
	}

	@Override
	public void setNewsList(List<News> newsList) {
		// TODO Auto-generated method stub
		newsList.addAll(newsList);
		
	}

	@Override
	public void addNews(News news) {
		// TODO Auto-generated method stub
		newsList.add(news);
	}

	@Override
	public List<News> getAllNews() {
		// TODO Auto-generated method stub
		return newsList;
	}

	@Override
	public boolean deleteNews(int newsId) {
		for(News news:newsList)
		{
			if(news.getNewsId()==newsId)
			{
				newsList.remove(news);
				return true;
			}
		}
		// TODO Auto-generated method stub
		return false;
	}

    /* This method should return all the news in the list */
   

    /* This method should set the list variable with new list of news */
   
    /*
	 * This method should News object as argument and add the new news object into
	 * list
	 */
    
    
    /* This method should return the list of news */
    
    /* This method should delete a specified news from the list */
    
}
