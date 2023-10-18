/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.itson.libro.iu;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import mx.itson.libro.entities.Answers;
import mx.itson.libro.entities.Categories;
import mx.itson.libro.entities.Publications;
import mx.itson.libro.entities.Users;
import mx.itson.libro.enums.Rol;


/**
 *
 * @author vagui
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Usuario
        Users user1 = new Users();
        user1.setName("Victor Rocha");
        user1.setEmail("victorerocha@gmail.com");
        user1.setPassword("123");
        user1.setRol(Rol.USER);

        Users user2 = new Users();
        user2.setName("Edith Rascon");
        user2.setEmail("edithvega09@gmail.com");
        user2.setPassword("456");
        user2.setRol(Rol.USER);

        Users user3 = new Users();
        user3.setName("Juan Pérez");
        user3.setEmail("juanperez@gmail.com");
        user3.setPassword("789");
        user3.setRol(Rol.USER);
        
        Users user4 = new Users();
        user4.setName("Juan Pérez");
        user4.setEmail("juanperez@gmail.com");
        user4.setPassword("789");
        user4.setRol(Rol.USER);
        
        //Categorias
        Categories categoria1 = new Categories();
        categoria1.setType("Tecnologia");
        List<Categories> categoirias = new ArrayList<>();
        categoirias.add(categoria1);

        //Respuesta
        Answers answers1 = new Answers(user2, new Date(), "Wooow");

        Answers answers2 = new Answers(user3, new Date(), "Estoy de acuerdo con la informacion");
        answers2.setParentAnswer(answers1);
        
        Answers answers3 = new Answers(user4, new Date(), "no estoy de acuerdo");
        answers2.setParentAnswer(answers1);
        

        List<Answers> answers = new ArrayList<>();
        answers.add(answers1);
        answers.add(answers2);
        answers.add(answers3);

        //publicacion
        Publications publication = new Publications();
        publication.setAuthor(user1);
        publication.setDate(new Date());
        publication.setCategorie(categoirias);
        publication.setTitle("Huawei Mate 60 Pro: el regreso del 5G y la llegada \nde las llamadas satelitales a la bestia de Huawei");
        publication.setDescription("Huawei acaba de hacer oficial el Mate 60 Pro. \nLa compañía no se rinde con la gama alta, y vuelve \nal escenario con un teléfono que quiere seguir compitiendo de tú a tú con \nlos mejores del mercado. Con un panel gigantesco, un potente sistema de cámaras y \nun precio de menos de 1.000 euros al cambio (al menos, en su país natal), \nel sucesor del Huawei Mate 50 Pro llega con conectividad 5G... gracias un gran sacrificio.");
        publication.setImage("https://i.blogs.es/462af3/f4rs8bmxuaavoms/840_560.jpeg");

        //imprimir las publicaciones
        System.out.println("Welcome to Social Media");
        System.out.println(publication.getTitle());
        System.out.println("Creado por " + publication.getAuthor().getName() + " el " + publication.getDate());
        System.out.println(publication.getCategorie());
        System.out.println(publication.getDescription());
        System.out.println(publication.getImage());
        System.out.println("Likes: " + publication.getLike() + " Dislikes: " + publication.getDislike());
        System.out.println("Respuestas:");
        for (Answers answer : answers) {
            if (answer.getParentAnswer() != null) {
                System.out.println("<< << "+answer.getAuthor().getName() + " respondió a " + answer.getParentAnswer().getAuthor().getName());
            } else {
                System.out.println("<< "+answer.getAuthor().getName());
            }
            System.out.println(answer.getDate());
            System.out.println(answer.getAnswer());
        }
        
    
    }
    
    

}
