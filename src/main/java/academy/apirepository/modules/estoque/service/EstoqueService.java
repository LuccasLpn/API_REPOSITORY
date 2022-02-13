package academy.apirepository.modules.estoque.service;

import academy.apirepository.modules.estoque.domain.Estoque;
import academy.apirepository.modules.estoque.repository.EstoqueRepository;
import academy.apirepository.modules.estoque.request.EstoquePost;
import academy.apirepository.modules.estoque.request.EstoquePut;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EstoqueService {

    private final EstoqueRepository repository;

    public Estoque save(EstoquePost estoquePost){
        Estoque estoque = new Estoque(estoquePost.getTipo(), estoquePost.getSubTipo());
        estoque.setDataAtualizacao(LocalDate.now());
        estoque.setPao(estoquePost.getPao());
        return repository.save(estoque);
    }

    public void update(EstoquePut estoquePut){
        Estoque estoque = new Estoque(estoquePut.getTipo(), estoquePut.getSubTipo());
        estoque.setPao(estoquePut.getPao());
        estoque.setDataAtualizacao(LocalDate.now());
        repository.save(estoque);
    }

    public void delete(EstoquePut estoquePut){
        Estoque estoque = new Estoque(estoquePut.getTipo(), estoquePut.getSubTipo());
        repository.delete(estoque);
    }

    public List<Estoque> findAll(){
        return repository.findAll();
    }

}
