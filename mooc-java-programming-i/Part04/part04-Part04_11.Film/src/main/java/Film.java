/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edwinandrew
 */
public class Film {
    private int ageRating;
    private String name;
    
    public Film (String filmName,int filmAgeRating ){
        this.ageRating = filmAgeRating;
        this.name = filmName;
    }
    public String name(){
        return name;
    }
    public int ageRating(){
        return ageRating;
    }
    
}