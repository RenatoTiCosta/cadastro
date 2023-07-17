package com.novo.projeto.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class GeradorPdfEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer id;
    //Dados pessoais
    public String nome;
    public String email;
    public String telefone;
    public String endereco;
    public String cpf;
    // Dados do exame
    public String tipo;
    public String olho_Direito;
    public String olho_Esquerdo;
    public String Dp_Olho_Direito;
    public String Dp_Olho_Esquerdo;
    public String adicao;
    public String lentes;
    public String exame;
    public String valor;
    //public String foto;

    //public Date data;


}
