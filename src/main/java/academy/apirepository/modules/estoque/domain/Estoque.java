package academy.apirepository.modules.estoque.domain;

import academy.apirepository.modules.estoque.enums.PaoEnum;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.io.Serializable;
import java.time.LocalDate;

@Document(collection = "Estoque")
@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
public class Estoque {

    @Id public KeyCompose id;

    public Estoque(String tipo, String subTipo){
        id = new KeyCompose(tipo, subTipo);
    }

    @Value public static class KeyCompose implements Serializable {
        String tipo;
        String subTipo;
    }

    private PaoEnum pao;
    private LocalDate dataAtualizacao;
    private String proteina;
    private Integer alface;
    private Integer tomate;
    private Integer queijo;
    private Integer picles;

    

}
