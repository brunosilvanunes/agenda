package br.com.treinamento.agenda.repository;

import br.com.treinamento.agenda.entity.ContatoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoRepository extends JpaRepository<ContatoEntity, Long> {
}
