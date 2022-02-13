package academy.apirepository.modules.estoque.service;

import academy.apirepository.modules.estoque.domain.Estoque;
import academy.apirepository.modules.estoque.repository.EstoqueRepository;
import academy.apirepository.modules.estoque.request.Model;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EstoqueService {

    private final EstoqueRepository repository;

    public Estoque save(Model model){
        Estoque estoque = new Estoque(model.getTipo(), model.getSubTipo());
        estoque.setPao(model.getPao());
        estoque.setDataAtualizacao(LocalDate.now());
        return repository.save(estoque);
    }

    public List<Estoque> findAll(){
        return repository.findAll();
    }

}
