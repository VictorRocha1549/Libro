/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.libro.entities;

import java.util.Date;

/**
 *
 * @author vagui
 */
public class Answers {
    private Users author;
    private String answer = new String();
    private Date date = new Date();
    private Answers parentAnswer;

        public Answers(Users author, Date date, String answer) {
        this.author = author;
        this.date = date;
        this.answer = answer;
    }


    public Users getAuthor() {
        return author;
    }

    public void setAuthor(Users author) {
        this.author = author;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Answers getParentAnswer() {
        return parentAnswer;
    }

    public void setParentAnswer(Answers parentAnswer) {
        this.parentAnswer = parentAnswer;
    }
}
