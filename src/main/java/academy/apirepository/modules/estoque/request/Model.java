package academy.apirepository.modules.estoque.request;

import academy.apirepository.modules.estoque.enums.PaoEnum;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.time.LocalDate;


@AllArgsConstructor
@Getter
public class Model {

    private String tipo;
    private String subTipo;
    private PaoEnum pao;
    @JsonFormat(pattern = "yyyy/mm/dd")
    private LocalDate dataAtualizacao;


}
