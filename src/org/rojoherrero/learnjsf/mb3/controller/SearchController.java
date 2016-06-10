package org.rojoherrero.learnjsf.mb3.controller;

import java.io.IOException;
import java.net.URLEncoder;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletResponse;

public class SearchController {

	private String searchString;
	private static final String GOOGLE = "https://www.google.com/#q=";
	private static final String BING = "http://www.bing.com/search?q=";

	public String getSearchString() {
		return searchString;
	}

	public void setSearchString(String searchString) {
		this.searchString = searchString;
	}

	public String search() throws IOException {
		searchString = URLEncoder.encode(searchString,"utf-8");
		String searchURL;
		if (Math.random() < 0.5) {
			searchURL = GOOGLE + searchString;
		} else {
			searchURL = BING + searchString;
		}
		ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();
		HttpServletResponse response = (HttpServletResponse) context.getResponse();
		response.sendRedirect(searchURL);
		return(null);
	}
}
