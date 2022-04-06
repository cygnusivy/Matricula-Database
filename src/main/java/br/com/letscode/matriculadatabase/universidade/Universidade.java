package br.com.letscode.matriculadatabase.universidade;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@ToString
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Universidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String nome;
    @Column
    private String campus;
    @Column
    private String centro;
    @Column
    private String departamento;

}
