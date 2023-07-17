package com.novo.projeto.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AtendimentoEntity {
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
    public String DP_Olho_Esquerdo;
    public String adicao;
    public String lentes;
    public String exame;
    public String valor;
    public String foto;

    public Date data;


}

