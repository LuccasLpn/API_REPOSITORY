package academy.apirepository.modules.estoque.repository.util;

import academy.apirepository.modules.estoque.domain.Estoque;
import academy.apirepository.modules.estoque.request.EstoquePost;

import java.time.LocalDate;

public class EstoqueCreator {


    public static Estoque createdEstoqueTobeSaved(){
        EstoquePost estoquePost = new EstoquePost();
        Estoque estoque = new Estoque(estoquePost.getTipo(), estoquePost.getSubTipo());
        estoque.setDataAtualizacao(LocalDate.now());
        estoque.setPao(estoquePost.getPao());
        estoque.setProteina(estoquePost.getProteina());
        estoque.setAlface(estoquePost.getAlface());
        estoque.setTomate(estoquePost.getTomate());
        estoque.setQueijo(estoquePost.getQueijo());
        estoque.setPicles(estoquePost.getPicles());
        return estoque;
    }
}
