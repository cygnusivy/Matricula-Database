package br.com.letscode.matriculadatabase.matricula;

import br.com.letscode.matriculadatabase.aluno.Aluno;
import br.com.letscode.matriculadatabase.universidade.Cursos;
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
public class Matricula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    @JoinColumn(name = "aluno_id", nullable = false)
    private  Aluno aluno;
    @Column
    private String numero_matricla;
    @ManyToOne
    @JoinColumn(name = "curso_id", nullable = false)
    private Cursos curso;
    @Column
    private String periodo;

}
