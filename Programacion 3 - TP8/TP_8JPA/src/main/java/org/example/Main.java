package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import org.example.Entities.Usuario;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("miJpa");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        Usuario usuario = new Usuario();
        usuario.setNombre("Juan");
        usuario.setApellido("Leonidas");

        tx.begin();
        em.persist(usuario);
        tx.commit();


    }
}