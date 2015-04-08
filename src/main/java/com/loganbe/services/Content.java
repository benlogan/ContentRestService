package com.loganbe.services;

public class Content {

    private final int pageNumber;

    /*
    private String[] data = {
    		"This is some text",
    		"here is some more text",
    		"and even more text",
    		"your not going to believe this...",
    		"more text",
    		"I'm bored now"};
    */
    
    private String response = "Chapter %d. Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
    
    public Content(int pageNumber) {
        this.pageNumber = pageNumber;
    }
    
    public String getContent() {
        //return data[pageNumber];
    	return String.format(response, pageNumber);
    }
    
}