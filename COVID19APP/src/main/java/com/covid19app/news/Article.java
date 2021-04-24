package com.covid19app.news;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * This class describes an article in the articles subobject obtained from the API call. Each article
 * has a source, author, title, description, url, image url, publisher, and content.
 * There is a toString() method to return the JSON object in a string.
 * @author Neil An
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Article {
	private Source source;
	private String author;
	private String title;
	private String description;
	private String url;
	private String urlToImage;
	private String publishedAt;
	private String content;
	
	public Source getSource() {
		return source;
	}
	public void setSource(Source source) {
		this.source = source;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUrlToImage() {
		return urlToImage;
	}
	public void setUrlToImage(String urlToImage) {
		this.urlToImage = urlToImage;
	}
	public String getPublishedAt() {
		return publishedAt;
	}
	public void setPublishedAt(String publishedAt) {
		this.publishedAt = publishedAt;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	  @Override
	  public String toString() {
	    return "Article{" +
	        "source='" + source + '\'' + ", author=" + author + ", title=" + title +
	         ", description=" + description +  ", url=" + url +  ", urlToImage=" + urlToImage +
	          ", publishedAt=" + publishedAt +  ", content=" + content +
	        '}';
	  }
}