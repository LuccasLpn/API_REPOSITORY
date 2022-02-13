package academy.apirepository.modules.estoque.controller;

import academy.apirepository.modules.estoque.domain.Estoque;
import academy.apirepository.modules.estoque.request.EstoquePost;
import academy.apirepository.modules.estoque.request.EstoquePut;
import academy.apirepository.modules.estoque.service.EstoqueService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api")
public class EstoqueController {

    private final EstoqueService estoqueService;

    @PostMapping(path = "/save")
    public ResponseEntity<Estoque>save(@RequestBody EstoquePost estoquePost){
        return new ResponseEntity<>(estoqueService.save(estoquePost), HttpStatus.CREATED);
    }

    @DeleteMapping(path = "/delete")
    public ResponseEntity<Void>delete(@RequestBody EstoquePut estoquePut){
        estoqueService.delete(estoquePut);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping(path = "/findAll")
    public ResponseEntity<List<Estoque>>findAll(){
        return ResponseEntity.ok(estoqueService.findAll());
    }



}
