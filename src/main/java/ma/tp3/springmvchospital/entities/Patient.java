package ma.tp3.springmvchospital.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
 @Entity
 @Data @NoArgsConstructor @AllArgsConstructor @Builder

public class Patient {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nom;
    private Date date_naissance;
    private boolean Malade;
    private int score;
 }
