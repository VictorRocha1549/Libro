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
        //Usuarios
        //Se crea una instancia de usuario para llamar a sus metodos y darles valor a sus atributos
        
        
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
        //Se crea una instancia de categoria  para llamar a sus metodos y darles valor a sus atributos
        Categories categoria1 = new Categories();
        categoria1.setType("Tecnologia");
        //se guardan en una lista cada una de las categorias creadas
        List<Categories> categoirias = new ArrayList<>();
        categoirias.add(categoria1);

        //Respuesta
        //de igual forma se instancia respuestas y esta pide como parametros los atributos, la diferencia entre cada una es que set Parent es para 
        //contestar al que ya respondió
        Answers answers1 = new Answers(user2, new Date(), "Wooow");

        Answers answers2 = new Answers(user3, new Date(), "Estoy de acuerdo con la informacion");
        answers2.setParentAnswer(answers1);
        
        Answers answers3 = new Answers(user4, new Date(), "no estoy de acuerdo");
        answers2.setParentAnswer(answers1);
        
//se guardan todas las respuestas en una lista
        List<Answers> answers = new ArrayList<>();
        answers.add(answers1);
        answers.add(answers2);
        answers.add(answers3);

        //publicacion
        // se instancia publicaciones y con sus metodos le damos valor a sus atributos
        Publications publication = new Publications();
        publication.setAuthor(user1);
        publication.setDate(new Date());
        publication.setCategorie(categoirias);
        publication.setTitle("Huawei Mate 60 Pro: el regreso del 5G y la llegada \nde las llamadas satelitales a la bestia de Huawei");
        publication.setDescription("Huawei acaba de hacer oficial el Mate 60 Pro. \nLa compañía no se rinde con la gama alta, y vuelve \nal escenario con un teléfono que quiere seguir compitiendo de tú a tú con \nlos mejores del mercado. Con un panel gigantesco, un potente sistema de cámaras y \nun precio de menos de 1.000 euros al cambio (al menos, en su país natal), \nel sucesor del Huawei Mate 50 Pro llega con conectividad 5G... gracias un gran sacrificio.");
        publication.setImage("https://i.blogs.es/462af3/f4rs8bmxuaavoms/840_560.jpeg");

        //imprimir las publicaciones
        //aquí se imprime la publicacion, los comentarios, etc

        System.out.println("Welcome to Social Media");
        System.out.println(publication.getTitle());//titulo
        System.out.println("Creado por " + publication.getAuthor().getName() + " el " + publication.getDate());//autor y fecha de creacion
        System.out.println(publication.getCategorie());//categoria
        System.out.println(publication.getDescription());//cuerpo de la publicacion
        System.out.println(publication.getImage());//imagen de referencia
        System.out.println("Likes: " + publication.getLike() + " Dislikes: " + publication.getDislike());//reacciones
        //la parte interesante
        System.out.println("Respuestas:");
        //todo lo que contenga respuestas se nombra answers
        //Esto verifica si la respuesta tiene una respuesta principal (un "padre o anterior o principal"). Si es así, significa que esta respuesta es una respuesta a otra respuesta.
        for (Answers answer : answers) {
            if (answer.getParentAnswer() != null) {
                //Si la respuesta tiene un "padre" (una respuesta principal), se imprime un mensaje que indica quién respondió a quién. Esto se hace con la línea:
                System.out.println("<< << "+answer.getAuthor().getName() + " respondió a " + answer.getParentAnswer().getAuthor().getName());
            } else {
                //Si la respuesta no tiene un "padre", se muestra un mensaje que solo contiene el nombre del autor de la respuesta actual que seria una respuesta "padre"
                System.out.println("<< "+answer.getAuthor().getName());
            }
            System.out.println(answer.getDate());
            System.out.println(answer.getAnswer());
        }
        
    
    }
    
    

}
