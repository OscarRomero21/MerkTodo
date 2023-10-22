package romero.oscar.aplicacion_web_springboot;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductosController {

    @Autowired
    private ProductosRepository productosRepository; 
    
    @GetMapping("")
    public String index(Model model){
        List<Productos> productos = productosRepository.findAll();
        model.addAttribute("productos", productos);
        return "index";

    }

    @GetMapping("/formulario")
    public String formulario (Model model) {
        model.addAttribute("productos", new Productos());
        return "formulario";

    }

    @PostMapping("/formulario")
    public String crear(@ModelAttribute("productos") Productos productos) {
    productosRepository.save(productos);
    return "redirect:/";
}

}
