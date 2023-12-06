package rinha.rinha.pessoa;


import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
@Table(name = "t_pessoa")
public class Pessoa {

    @Id
    public UUID id;

    @Column(name = "apelido")
    public String apelido;

    @Column(name = "nome")
    public String nome;
    @Column(name = "nascimento")
    public String nascimento;
    @Column(name = "stack")
    public String stack;
}
