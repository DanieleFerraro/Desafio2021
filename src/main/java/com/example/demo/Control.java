package com.example.demo;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.demo.Contatos;
import com.example.demo.ContatosRep;

@RestController
@RequestMapping("/Contatos")

public class Control {
	
	ContatosRep contatoRep;
	
	@PostMapping(consumes= "aplication/json")
	public ResponseEntity<Object> addContato(@RequestBody Contatos contato){
		Contatos salveContato = contatoRep.save(contato);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().replacePath("/contatos").path("/{id}").buildAndExpand(salveContato.getId()).toUri();

		return ResponseEntity.created(uri).build();
	}
	@GetMapping
	public ResponseEntity<List<Contatos>> listaContatos(){
	return ResponseEntity.ok().body(contatoRep.findAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Contatos> buscaId(@PathVariable Long id){
	return ResponseEntity.ok().body(contatoRep.findById(id).get());
	}
	

}
