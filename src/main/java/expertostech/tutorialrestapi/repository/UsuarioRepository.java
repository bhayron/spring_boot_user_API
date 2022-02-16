package expertostech.tutorialrestapi.repository;

import expertostech.tutorialrestapi.model.UsuarioModel;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<UsuarioModel, Integer> {

}
