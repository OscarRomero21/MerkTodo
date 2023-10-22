package romero.oscar.aplicacion_web_springboot;



import java.time.LocalDateTime;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;
import lombok.Data;

@Data
@Document(collection = "Productos")
public class Productos {
     @Id
     private String id;
     private String nombre;
     private double precio;
     private String tipo;
     private int existencia;
     private LocalDateTime fechaRegistro;
    
}