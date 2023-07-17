package com.novo.projeto.controller;


import com.novo.projeto.entity.UsuarioEntity;
import com.novo.projeto.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@Controller
@RequestMapping("/funcionario")
public class UsuarioController {
    private UsuarioService usuarioService;
    private Model model;

    @Autowired
    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }
    @GetMapping("/add")
    public String showForm(Model model) {
        UsuarioEntity usuario = new UsuarioEntity(); // Correção: Adicione o nome da variável "usuario"
        model.addAttribute("usuario", usuario); // Correção: Substitua "funcionario()" por "usuario"
        return "/funcionario";
    }

    @GetMapping("/senha")
    private String showFormSenha(Model model) {
        this.model = model;
        UsuarioEntity usuario = new UsuarioEntity();
        model.addAttribute("usuario", usuario);
        return "/senha";

    }





   // @PostMapping("/add")
 //   @ResponseBody
   // public String showForm(Model model) {
    //    UsuarioEntity funcionario = new UsuarioEntity();
    //    model.addAttribute("funcionario", funcionario);
   //     return "/funcionario";
   // }





    //@PostMapping("/funcionario-add")
   // @ResponseBody
    //public String criarForm(Model model) {
       //model.addAttribute("funcionario", new UsuarioEntity());
       // return "/funcionario-add";
   // }
   // @GetMapping("/add")
   // public String showForm(Model model) {
      //  UsuarioEntity funcionarioadd = new UsuarioEntity();
      //  model.addAttribute("funcionarioadd", funcionarioadd);
      // return "pedido";
   // }


    @GetMapping("/login")
    @ResponseBody
    public String loginPage() {
        return "/login"; // Retorna o nome do template Thymeleaf correspondente à página de login
    }


    public void excluir(@PathVariable Integer id) {
        usuarioService.excluir(id);
    }

    @GetMapping("/buscar/{id}")
    public String buscarFuncionario(Model model, @RequestParam(required = false) String query) {
        List<UsuarioEntity> funcionario;

        if (query != null && !query.isEmpty()) {
            funcionario = usuarioService.buscarPorNomeOuEmail(query);
        } else {
            funcionario = usuarioService.listarTodosUser();
        }

        model.addAttribute("funcionario", funcionario);
        return "buscarFuncionario";
    }

    @GetMapping("/listar")
    public String listarTodos(Model model) {
        List<UsuarioEntity> funcionario = usuarioService.listarTodosUser();
        model.addAttribute("funcionario", funcionario);
        return "/funcionario/listar";
    }
    @PutMapping("/editar")
    public String atualizarFuncionario(@ModelAttribute("funcionario") UsuarioEntity usuarioEntity) {
        usuarioService.salvar(usuarioEntity);
        return "redirect:/funcionario/listar";
    }

}
