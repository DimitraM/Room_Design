package com.mycompany.roomdesign;

import java.awt.Color;
import java.lang.String;
import java.util.Scanner;

/**
 *
 * @author Chrysoula
 */
public class Wall {
    
    private String color; 
    private String material; 
    private String wallpaper; 
    
   
    //Wall contructor
    public Wall(String color,String material,String wallpaper){
        
        this.color = color;
        this.material = material;
        this.wallpaper = wallpaper;
    }

    
    
    /*****GETTERS AND SETTERS FOR PRIVATE VARIABLES*****/
    //Color
    public String getColor()
    {
        return color;
    }
    
    public void setColor(String newColor)
    {
        this.color = newColor;
    }
    
     //Wallpaper
    public String getWallpaper()
    {
        return wallpaper;
    }
    
    public void setWallpaper(String newWallpaper)
    {
        this.material = newWallpaper;
    }
    
    //Material
    public String getMaterial()
    {
        return material;
    }
    
    public void setMaterial(String newMaterial)
    {
        this.material = newMaterial;
    }
    
        
       
    }

