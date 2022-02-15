package academy.apirepository.modules.estoque.service;

import academy.apirepository.modules.estoque.domain.Estoque;
import academy.apirepository.modules.estoque.enums.PaoEnum;
import academy.apirepository.modules.estoque.repository.EstoqueRepository;
import academy.apirepository.modules.estoque.repository.util.EstoqueCreator;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

@ExtendWith(SpringExtension.class)
class EstoqueServiceTest {

    @InjectMocks
    private EstoqueService service;

    @Mock
    private EstoqueRepository repository;



    @BeforeEach
    void setUp(){
        BDDMockito.when(repository.save(ArgumentMatchers.any(Estoque.class)))
                .thenReturn(EstoqueCreator.createdEstoqueTobeSaved());

        BDDMockito.doNothing().when(repository).delete(ArgumentMatchers.any(Estoque.class));

        BDDMockito.when(repository.findAll()).thenReturn(List.of(
                EstoqueCreator.createdEstoqueTobeSaved()));

    }

    @Test
    @DisplayName("listAll Return list of when successful")
    void listAll_ReturnsListAll_WhenSuccessful(){
        String proteina = EstoqueCreator.createdEstoqueTobeSaved().getProteina();
        List<Estoque> estoques = service.findAll();
        Assertions.assertThat(estoques)
                .isNotNull()
                .isNotEmpty()
                .hasSize(1);
        Assertions.assertThat(estoques.get(0).getProteina()).isEqualTo(proteina);
    }



}