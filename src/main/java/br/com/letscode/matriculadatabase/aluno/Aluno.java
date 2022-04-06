package br.com.letscode.matriculadatabase.aluno;

import br.com.letscode.matriculadatabase.endereco.Endereco;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@ToString
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String nome;
    @Column
    private Date data_de_nascimento;
    @Column
    private String cpf;
    @Column
    private String email;
    @ManyToOne
    @JoinColumn(name = "endereco_id", nullable = false)
    private Endereco endereco;
}
