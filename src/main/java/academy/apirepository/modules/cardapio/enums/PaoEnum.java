package academy.apirepository.modules.cardapio.enums;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public enum PaoEnum {

    Brioche(1, "Brioche"),
    Focaccia(2, "Focaccia"),
    Ciabatta(3, "Ciabatta");

    private int cod;
    private String description;



    private Integer getCod() {
        return cod;
    }

    public static PaoEnum toEnum(Integer cod){
        if(cod == null){
            return null;
        }
        for( PaoEnum x : PaoEnum.values()){
            if (cod.equals(x.getCod())){
                return x;
            }
        }
        throw new IllegalArgumentException("ID invalido: " + cod);
    }

}
