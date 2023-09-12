package com.desmond.sprintaop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FilteringTechnique1 {

    @Autowired
    private Movie movie;

    public String contentBasedFiltering(){
        return movie.getMovieDetails();
    }

    
    
}
