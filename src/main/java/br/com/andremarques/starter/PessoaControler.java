package br.com.andremarques.starter;

import br.com.andremarques.starter.model.Pessoa;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/pessoa")
public class PessoaControler {

    @RequestMapping(value="/nome-completo", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Pessoa getNomePessoa() {
        var pessoa = new Pessoa();
        pessoa.setNome("André Pereira");
        pessoa.setSobrenome("Marques");
        return pessoa;
    }
}
