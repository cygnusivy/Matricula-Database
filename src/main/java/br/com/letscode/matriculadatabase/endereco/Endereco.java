package br.com.letscode.matriculadatabase.endereco;

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
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String uf;
    @Column
    private String cidade;
    @Column
    private String bairro;
    @Column
    private String cep;
    @Column
    private String complemento;

}
