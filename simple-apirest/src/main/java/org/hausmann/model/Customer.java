package org.hausmann.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity // Essa anotação indica ao JPC/HIBERNATE que essa classe faz ligacao com banco de dados, que representa uma tabela no banco
@Data // Lombok
@NoArgsConstructor // Lombok - Sem essas anotacoes do lmbok, teriamos que criar os metodos getter, setter e construtores manualmente
public class Customer {
    @Id //Vai dizer ao banco de dados que toda vez que essa informação for criada, ela vai gerar uma chave primaria que sera o identificador unico deste Cliente
    @GeneratedValue // GeneratedValue Vai entender que é uma sequencia numerica 1, 2, 3, 4...
    private Long id;

    private String name;

    private String lastName;

    private Integer age;

    private String email;

}
