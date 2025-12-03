package org.brunobranchi;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.List;

@Entity
public class Pessoa extends PanacheEntity {

    public String nome;
    public int anoNascimento;

    public static List<Pessoa> findByAnoNascimento(int anoNascimento) {
        return find("anoNascimento", anoNascimento).list();
    }

}
