package rinha.rinha.pessoa;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PessoaService {

    @Autowired
    private IPessoaRepository pessoaRepository;

    public UUID inserir(Pessoa pessoa){
        return pessoaRepository.save(pessoa).getId();
    }
}
