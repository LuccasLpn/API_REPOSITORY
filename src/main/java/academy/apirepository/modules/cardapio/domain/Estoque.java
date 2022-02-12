package academy.apirepository.modules.cardapio.domain;

import academy.apirepository.modules.cardapio.enums.PaoEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;

@Document
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Estoque implements Serializable {



    @Id
    private String chaveParticao;
    @Id
    private String chaveFiltragem;

    private PaoEnum pao;
    private Date dataAtualizacao;
    private String proteina;
    private Integer alface;
    private Integer tomate;
    private Integer queijo;
    private Integer picles;



}
