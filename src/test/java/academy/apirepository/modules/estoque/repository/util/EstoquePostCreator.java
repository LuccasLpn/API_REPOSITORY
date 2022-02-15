package academy.apirepository.modules.estoque.repository.util;

import academy.apirepository.modules.estoque.domain.Estoque;
import academy.apirepository.modules.estoque.request.EstoquePost;

public class EstoquePostCreator {

    public static EstoquePost createdEstoquePost(){
        return EstoquePost.builder()
                .pao(EstoqueCreator.createdEstoqueTobeSaved().getPao())
                .dataAtualizacao(EstoqueCreator.createdEstoqueTobeSaved().getDataAtualizacao())
                .proteina(EstoqueCreator.createdEstoqueTobeSaved().getProteina())
                .alface(EstoqueCreator.createdEstoqueTobeSaved().getAlface())
                .tomate(EstoqueCreator.createdEstoqueTobeSaved().getTomate())
                .queijo(EstoqueCreator.createdEstoqueTobeSaved().getQueijo())
                .picles(EstoqueCreator.createdEstoqueTobeSaved().getPicles())
                .build();
    }

    }
