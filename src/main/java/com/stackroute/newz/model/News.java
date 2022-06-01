package com.stackroute.newz.model;

import java.time.LocalDateTime;

/* 
 * Annotate the class with @Component annotation. 
 * @Component annotation is used to crete singleton instance of of the class
 *
 */


/*
 * The class "News" will be acting as the data model for the News data in the ArrayList.
 */
public class News {
	private int newsId;
	private String title;
	private String author;
	private String description;
	private String content;
	private LocalDateTime publishedAt=LocalDateTime.now();
	
	/*
	 * This class should have five fields (newsId, title, author,
	 * description, content and publishedAt). This class should also contain the getters and
	 * setters for the fields. The value of publishedAt should not be accepted from
	 * the user but should be always initialized with the system date
	 */
    

	
    public News() {
    	/* default constructor */
    }
    

	public News(int newsId, String title, String author, String description, String content,
			LocalDateTime publishedAt) {
		super();
		this.newsId = newsId;
		this.title = title;
		this.author = author;
		this.description = description;
		this.content = content;
		this.publishedAt = publishedAt;
	}


	public int getNewsId() {
		
		return newsId;
	}

	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}

	public String getTitle() {
		/*
		 * try { title.equals(null); } catch(NullPointerException n) {
		 * System.out.println("null titile"); } return title;
		 */
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	

	//@SuppressWarnings("finally")
	public String getAuthor() {
		/*
		 * try { title.equals(null); } catch(NullPointerException n) { return
		 * n.toString(); } finally { return author;
		 */
	return author;
	}
	public void setAuthor(String author) {
		
		this.author = author;
	}

	public String getDescription() {
		/*
		 * try { description.equals(null); } catch(NullPointerException n) { return
		 * n.toString(); } finally { return description;}
		 */
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getContent() {
		/*
		 * try { content.equals(null); } catch(NullPointerException n) { return
		 * n.toString(); } finally { return content;}
		 */
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	

	public LocalDateTime getPublishedAt() {
		return publishedAt;
	}

	public void setPublishedAt(LocalDateTime publishedAt) {
		this.publishedAt = publishedAt;
	}

	@Override
	public String toString() {
		return "News [newsId=" + newsId + ", title=" + title + ", author=" + author + ", description=" + description
				+ ", content=" + content + ", publishedAt=" + publishedAt + "]";
	}

	
    /* All the getters/setters definition should be implemented here */
    
 }
