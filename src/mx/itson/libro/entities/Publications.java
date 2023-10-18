/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.libro.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author vagui
 */
public class Publications {

    /**
     * @return the answers
     */
    
    private Date date = new Date();
    private String title = new String();
    private String description = new String();
    private String image = new String();
    private Users author;
    private List<Categories> categorie = new ArrayList<>();
    private int like = 0;
    private int dislike = 0;
    private List<Answers> answers = new ArrayList<>();

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Users getAuthor() {
        return author;
    }

    public void setAuthor(Users author) {
        this.author = author;
    }

    public List<Categories> getCategorie() {
        return categorie;
    }

    public void setCategorie(List<Categories> categorie) {
        this.categorie = categorie;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public int getDislike() {
        return dislike;
    }

    public void setDislike(int dislike) {
        this.dislike = dislike;
    }

    public List<Answers> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answers> answers) {
        this.answers = answers;
    }



}
