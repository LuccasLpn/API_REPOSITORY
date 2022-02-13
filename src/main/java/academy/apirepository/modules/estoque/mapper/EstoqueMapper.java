package academy.apirepository.modules.estoque.mapper;

import academy.apirepository.modules.estoque.domain.Estoque;
import academy.apirepository.modules.estoque.request.EstoquePost;
import academy.apirepository.modules.estoque.request.EstoquePut;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public abstract class EstoqueMapper {

    public static final EstoqueMapper INSTANCE = Mappers.getMapper(EstoqueMapper.class);

    public abstract Estoque toPost(EstoquePost estoquePost);
    public abstract Estoque toPut(EstoquePut estoquePut);

}
