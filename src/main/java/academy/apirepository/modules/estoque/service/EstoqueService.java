package academy.apirepository.modules.estoque.service;

import academy.apirepository.modules.estoque.domain.Estoque;
import academy.apirepository.modules.estoque.repository.EstoqueRepository;
import academy.apirepository.modules.estoque.request.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class EstoqueService {

    @Autowired
    private EstoqueRepository estoqueRepository;

    public Estoque save(Model model){
        Estoque estoque = new Estoque(model.getTipo(), model.getSubTipo());
        estoque.setPao(model.getPao());
        estoque.setDataAtualizacao(LocalDate.now());
        return estoqueRepository.save(estoque);
    }

    public List<Estoque> findAll(){
        return estoqueRepository.findAll();
    }

}
