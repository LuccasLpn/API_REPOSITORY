package academy.apirepository.modules.estoque.repository.util;

import academy.apirepository.modules.estoque.request.EstoquePost;
import academy.apirepository.modules.estoque.request.EstoquePut;

public class EstoquePutCreator {

    public static EstoquePut createdEstoquePut(){
        return EstoquePut.builder()
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
