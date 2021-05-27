package galerie.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import galerie.entity.Personne;

// This will be AUTO IMPLEMENTED by Spring 

public interface PersonneRepository extends JpaRepository<Personne, Integer> {
    /**
     * Calculer le budget art pour une personne
     * @param l'année pour laquelle on souhaite calculer le budget
     * @return le budget pour l'année
     */
    //float budgetArt(Integer annee);
}
