package academy.apirepository.modules.estoque.request;

import academy.apirepository.modules.estoque.domain.Estoque;
import academy.apirepository.modules.estoque.enums.PaoEnum;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Builder
@Data
@AllArgsConstructor
public class EstoquePost {

    private String tipo;
    private String subTipo;
    private PaoEnum pao;
    @JsonFormat(pattern = "yyyy/mm/dd")
    private LocalDate dataAtualizacao;
    private String proteina;
    private Integer alface;
    private Integer tomate;
    private Integer queijo;
    private Integer picles;
}
