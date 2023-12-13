package rinha.rinha.pessoa;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.UUID;

@RestController
@RequestMapping(value = "/pessoas")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @ExceptionHandler(HttpMessageNotReadableException.class)
    protected ResponseEntity<Object> handleHttpMessageNotReadableException(HttpMessageNotReadableException ex) {
        return ResponseEntity.unprocessableEntity().build();
    }

    @ExceptionHandler(MissingServletRequestParameterException.class)
    protected ResponseEntity<Object> handleMissingServletRequestParameterException(MissingServletRequestParameterException ex) {
        return ResponseEntity.badRequest().build();
    }

    @PostMapping
    public ResponseEntity<Object> inserir(@RequestBody Pessoa pessoaRequest){

        if(true){
            return ResponseEntity.unprocessableEntity().build();
        }

        if(true){
            return ResponseEntity.badRequest().build();
        }

        try{
            pessoaRequest.setId( UUID.randomUUID());
            return ResponseEntity.created(
                    URI.create("/pessoas/"+pessoaService.inserir(pessoaRequest))
            ).build();


        }catch (DataIntegrityViolationException e){
                throw e;
        }
    }
}
