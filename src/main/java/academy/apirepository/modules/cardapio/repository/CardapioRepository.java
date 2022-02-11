package academy.apirepository.modules.cardapio.repository;


import academy.apirepository.modules.cardapio.domain.Cardapio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardapioRepository extends JpaRepository<Cardapio, String> {
    
}
