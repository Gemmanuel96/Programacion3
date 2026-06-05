package ar.edu.tup.programacion3;

import ar.edu.tup.programacion3.Entities.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;


import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("mibase");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();
        Usuario usuario = Usuario.builder()
                .nombre("Gonzalo")
                .apellido("Nuniez")
                .build();


        em.persist(usuario);
        tx.commit();

    }
}