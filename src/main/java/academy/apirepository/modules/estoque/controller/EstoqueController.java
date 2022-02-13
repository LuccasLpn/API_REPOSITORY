package academy.apirepository.modules.estoque.controller;

import academy.apirepository.modules.estoque.domain.Estoque;
import academy.apirepository.modules.estoque.request.Model;
import academy.apirepository.modules.estoque.service.EstoqueService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class EstoqueController {

    private final EstoqueService estoqueService;

    @PostMapping
    public ResponseEntity<Estoque>save(@RequestBody Model model){
        return new ResponseEntity<>(estoqueService.save(model), HttpStatus.CREATED);
    }



}
