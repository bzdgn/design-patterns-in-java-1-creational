package creational.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {
	
	protected List<Page> pages = new ArrayList<>();
	
	public Website() {
		this.createWebsite();
	}
	
	// Concrete Factory will implement this method
	public abstract void createWebsite();
	
	// setters & getters
	public List<Page> getPages() {
		return pages;
	}

	public void setPages(List<Page> pages) {
		this.pages = pages;
	}
	
}
