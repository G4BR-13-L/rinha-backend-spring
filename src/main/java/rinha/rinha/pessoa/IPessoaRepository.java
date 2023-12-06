package rinha.rinha.pessoa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPessoaRepository extends JpaRepository<Pessoa, Long> {
}
