package br.com.treinamento.agenda.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "contato")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ContatoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "type_email")
    private String typeEmail;

    @Column(name = "type_number")
    private String typeNumber;

    @Column(name = "number")
    private String number;
}
