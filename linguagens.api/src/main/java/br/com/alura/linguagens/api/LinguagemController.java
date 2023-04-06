package br.com.alura.linguagens.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LinguagemController {


    /* 
    private List<Linguagem> linguagens = 
    List.of(
        new Linguagem("Java", "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/java/java.png", 1),
        new Linguagem("PHP", "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/php/php.png",2),
        new Linguagem("C#", "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/csharp/csharp.png",3)
    );
    */

    @Autowired
    private LinguagemRepository repositorio;

	@GetMapping("/linguagensx")
	public List<Linguagem> obterLinguagens(){
        List<Linguagem> linguagens = repositorio.findAll();
        return linguagens;
		
	}
	
	 @PostMapping("/linguagens")
    	public Linguagem cadastrarLinguagem(@RequestBody Linguagem linguagem) {
             Linguagem linguagemSalva = repositorio.save(linguagem);
             return linguagemSalva;
        } 
	
    @GetMapping(value="linguagem-preferida")
    public String processaLinguagemPreferida(){

       return "Oi, java!";
    }
    
}































