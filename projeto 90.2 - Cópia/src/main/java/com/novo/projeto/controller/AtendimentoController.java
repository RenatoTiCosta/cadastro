package com.novo.projeto.controller;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.novo.projeto.entity.AtendimentoEntity;
import com.novo.projeto.repository.AtendimentoRepository;
import com.novo.projeto.service.AtendimentoService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Controller
@RequestMapping("/pedido")
public class AtendimentoController {
    private AtendimentoService atendimentoService;

    @Autowired
    public AtendimentoController(AtendimentoService atendimentoService) {
        this.atendimentoService = atendimentoService;
    }

    @GetMapping("/add")
    public String showForm(Model model) {
        AtendimentoEntity atendimentoEntity = new AtendimentoEntity();
        model.addAttribute("atendimentoEntity", atendimentoEntity);
        return "pedido";
    }

    @PostMapping("/add-criar")
    public String adicionarAtendimento(@ModelAttribute("atendimento") AtendimentoEntity atendimentoEntity, @RequestParam("foto") MultipartFile foto) {
        // Lógica para salvar a foto
        if (!foto.isEmpty()) {
            try {
                byte[] fotoBytes = foto.getBytes();
                // Salvar a foto em algum diretório ou banco de dados
            } catch (IOException e) {
                // Tratar a exceção adequadamente
            }
        }

        // Redirecione para a página pedido.html
        return "pedido";
    }


    @PutMapping("/editar")
    public String atualizarAtendimento(@ModelAttribute("atendimento") AtendimentoEntity atendimentoEntity) {
        atendimentoService.salvar(atendimentoEntity);
        return "redirect:/pedido/listar";
    }

    @PostMapping("/orcamento")
    public String showOrcamento(Model model) {
        AtendimentoEntity atendimento = new AtendimentoEntity(); // Create the 'atendimento' object
        model.addAttribute("atendimento", atendimento); // Add it as a model attribute
        return "orcamento"; // Return the name of the Thymeleaf template
    }
}




