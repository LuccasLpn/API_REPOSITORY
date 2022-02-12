package academy.apirepository.modules.cardapio.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document
@AllArgsConstructor
@Builder
public class Estoque implements Serializable {


    @Id
    private String id;
    private String name;

}
