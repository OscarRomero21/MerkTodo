package romero.oscar.aplicacion_web_springboot;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductosRepository extends MongoRepository<Productos, String>{

}
