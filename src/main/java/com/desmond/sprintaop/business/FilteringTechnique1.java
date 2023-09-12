package com.desmond.sprintaop.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desmond.sprintaop.aspect.MeasureTime;
import com.desmond.sprintaop.data.Movie;

@Service
public class FilteringTechnique1 {

    @Autowired
    private Movie movie;

    @MeasureTime
    public String contentBasedFiltering(){
        return movie.getMovieDetails();
    }

    
    
}
