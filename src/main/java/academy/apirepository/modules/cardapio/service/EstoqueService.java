package academy.apirepository.modules.cardapio.service;

import academy.apirepository.modules.cardapio.domain.Estoque;
import academy.apirepository.modules.cardapio.repository.EstoqueRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EstoqueService {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

    private final EstoqueRepository estoqueRepository;

    
    public Estoque save(Estoque estoque){
        sdf.format(estoque.getDataAtualizacao());
        return estoqueRepository.insert(estoque);
    }

    public List<Estoque> findAll(){
        return estoqueRepository.findAll();
    }

}
