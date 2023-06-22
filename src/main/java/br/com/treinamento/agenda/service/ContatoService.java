package br.com.treinamento.agenda.service;

import br.com.treinamento.agenda.entity.ContatoEntity;
import br.com.treinamento.agenda.model.ContatoDTO;
import br.com.treinamento.agenda.model.EmailDTO;
import br.com.treinamento.agenda.model.PhoneDTO;
import br.com.treinamento.agenda.repository.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContatoService {

    @Autowired
    private ContatoRepository repository;

    public List<ContatoDTO> listarContatos(){
        List<ContatoEntity> contatoEntities = repository.findAll();
        List<ContatoDTO> contatoDTOS = new ArrayList<>();

        contatoEntities.forEach(contatoEntity ->{
            ContatoDTO contatoDTO = new ContatoDTO();
            EmailDTO emailDTO = new EmailDTO();
            PhoneDTO phoneDTO = new PhoneDTO();

            contatoDTO.setName(contatoEntity.getName());

            emailDTO.setAddress(contatoEntity.getAddress());
            emailDTO.setType(contatoEntity.getTypeEmail());

            phoneDTO.setNumber(contatoEntity.getNumber());
            phoneDTO.setType(contatoEntity.getTypeNumber());

            contatoDTO.setEmailDTO(emailDTO);
            contatoDTO.setPhoneDTO(phoneDTO);

            contatoDTOS.add(contatoDTO);
        });

        return contatoDTOS;
    }

    public ContatoDTO salvar(ContatoDTO contatoDTO) {
        ContatoEntity contatoEntity = new ContatoEntity();

        contatoEntity.setName(contatoDTO.getName());
        contatoEntity.setAddress(contatoDTO.getEmailDTO().getAddress());
        contatoEntity.setTypeEmail(contatoDTO.getEmailDTO().getType());
        contatoEntity.setTypeNumber(contatoDTO.getPhoneDTO().getType());
        contatoEntity.setNumber(contatoDTO.getPhoneDTO().getNumber());

        repository.save(contatoEntity);

        return contatoDTO;
    }
}
