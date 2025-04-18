package repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.informationcofig.spring.fitbody.apirest.usuarios.Cliente;

@Repository
public interface UsuarioRepositorio extends JpaRepository <Cliente, Integer>{
    
}
