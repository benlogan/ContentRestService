package com.loganbe.services;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContentController {

	private final int CONTENT_MAX = 25;
	
    @RequestMapping("/content")
    public Content greeting(@RequestParam(value="page", defaultValue="1") int pageNumber) {
    	if(pageNumber > 0 && pageNumber <= CONTENT_MAX) {
    		return new Content(pageNumber);
    	} else {
    		throw new NoContentException();
    	}
    }
    
    @ResponseStatus(value = org.springframework.http.HttpStatus.NO_CONTENT) //204
    public final class NoContentException extends RuntimeException {
       //  class definition
    }
    
}