package br.com.ednilson.cicero.entity;

public class EventosEntity {

	private String title;
	private String start;
	private String end;
	private String url;
	
	public EventosEntity(){
		
	}	
	
	public EventosEntity(String title, String start, String end, String url) {
		super();
		this.title = title;
		this.start = start;
		this.end = end;
		this.url = url;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public String getEnd() {
		return end;
	}
	public void setEnd(String end) {
		this.end = end;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
}
