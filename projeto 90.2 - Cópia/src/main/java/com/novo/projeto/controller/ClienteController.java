package com.novo.projeto.controller;
import com.novo.projeto.entity.ClienteEntity;
import com.novo.projeto.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
   private ClienteService clienteService;


    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }


    @GetMapping("/add")
    public ModelAndView criarForm() {
        ModelAndView modelAndView = new ModelAndView("cliente-cadastro");
        modelAndView.addObject("cliente", new ClienteEntity());
        return modelAndView;
    }

    @GetMapping("/listar-cliente")
    public String showForm(Model model) {
        List<ClienteEntity> cliente = clienteService.listarTodos();
        model.addAttribute("cliente", cliente);
        return "/listar-cliente";
    }

    @GetMapping("/cliente-buscar")
    public String buscarCliente(Model model, @RequestParam(required = false) String query) {
        List<ClienteEntity> cliente;

        if (query != null && !query.isEmpty()) {
            cliente = clienteService.buscarPorNomeOuEmail(query);
        } else {
            cliente = clienteService.listarTodos();
        }
        model.addAttribute("cliente", cliente);
        return "cliente-buscar";
    }






   // @PostMapping("/add") // Criar um novo cliente
   // public String criar(@ModelAttribute("cliente") ClienteEntity clienteEntity) {
     //   clienteService.salvar(clienteEntity);
    //    return "redirect:/listarcliente";
   // }



    //@GetMapping("/excluir/{id}") // botão de excluir em listar e buscar cliente
    //public String excluirCliente(@PathVariable("id") Integer id) {
    //  clienteService.excluirCliente(id);
     //  return "redirect:/cliente/listar";
    //}

   //@DeleteMapping("/excluir/{id}")
   // @ResponseBody
   // public void excluir(@PathVariable Integer id) {
     //   clienteService.excluir(id);
    //}

   // @PutMapping("/editar/{id}")
    //public String editarCliente(@PathVariable("id") Integer id, Model model) {
    //    ClienteEntity cliente = clienteService.buscarPorId(id);
    //   if (cliente != null) {
      //      model.addAttribute("cliente", cliente);
       //     return "editarCliente";
       // }
       // return "redirect:/cliente/listar-cliente";
    //}

    //@PutMapping("/editar")
    ///public String atualizarCliente(@ModelAttribute("cliente") ClienteEntity clienteEntity) {
      //  clienteService.salvar(clienteEntity);
      //  return "redirect:/cliente/listar-cliente";
   // }



}
