package br.com.treinamento.agenda.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ContatoDTO {

    private Long id;
    private String name;

    private EmailDTO emailDTO;

    private PhoneDTO phoneDTO;
}
