package academy.apirepository.modules.estoque.repository;

import academy.apirepository.modules.estoque.domain.Estoque;
import academy.apirepository.modules.estoque.repository.util.EstoqueCreator;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;


@DataMongoTest
@DisplayName("Test For EstoqueRepository")
class EstoqueRepositoryTest {


    @Autowired
    private EstoqueRepository repository;



    @Test
    @DisplayName("Saved Persist Estoque When SuccessFull")
    void Save_PersistEstoque_WhenSuccessFull(){
        Estoque estoque = EstoqueCreator.createdEstoqueTobeSaved();
        Estoque savedEstoque = this.repository.save(estoque);
        Assertions.assertThat(savedEstoque).isNotNull();
        Assertions.assertThat(savedEstoque.getPao()).isEqualTo(estoque.getPao());
    }

    @Test
    @DisplayName("Saved Update Estoque When SuccessFull")
    void Save_UpdateEstoque_WhenSuccessFull(){
        Estoque estoque = EstoqueCreator.createdEstoqueTobeSaved();
        Estoque savedEstoque = this.repository.save(estoque);
        savedEstoque.setPicles(300);
        Estoque savedUpdate = this.repository.save(estoque);
        Assertions.assertThat(savedUpdate).isNotNull();
        Assertions.assertThat(savedUpdate.getPicles()).isEqualTo(savedEstoque.getPicles());
    }

}