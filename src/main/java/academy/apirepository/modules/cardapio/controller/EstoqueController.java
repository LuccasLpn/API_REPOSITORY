package academy.apirepository.modules.cardapio.controller;


import academy.apirepository.modules.cardapio.domain.Estoque;
import academy.apirepository.modules.cardapio.service.EstoqueService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class EstoqueController {

    private final EstoqueService estoqueService;


    @PostMapping
    public ResponseEntity<Estoque>save(@RequestBody Estoque estoque){
        return new ResponseEntity<>(estoqueService.save(estoque), HttpStatus.CREATED);
    }

    @GetMapping(path = "/findAll")
    public ResponseEntity<List<Estoque>> findAll(){
        return ResponseEntity.ok(estoqueService.findAll());
    }
}
