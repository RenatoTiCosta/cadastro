package com.novo.projeto.service;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.novo.projeto.entity.GeradorPdfEntity;
import org.springframework.stereotype.Service;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.FileSystemNotFoundException;
import java.util.ArrayList;

@Service
public class CreatePdfFileService {

    public void createPdf() {
        String filePdf = "C:/Users/renat/OneDrive - UFN - Universidade Franciscana/Desktop/Pdffile/SamplePdfFile.pdf";
        ArrayList<GeradorPdfEntity> geradorPdfEntity = new ArrayList();
        GeradorPdfEntity s1 = new GeradorPdfEntity(11, "Maria", "maria@gmail.com", "21-9999-9999", "Rua: Brasil, 101", "12345678900", "Multifocal", "- 1.00", "-1.50", "30", "30", "+1.50", "Solar com Antireflexo", "Data do Exame 1", "149,00");
        //GeradorPdfEntity s2 = new GeradorPdfEntity(12, "Maria", "maria@gmail.com", "21-11111-1111", "Endereço 1", "12345678900", "Multifocal", "-1.00", "-1.50", "30", "30", "+1.50", "Solar com Ar", "Data do Exame 1", "100,00");
      //  GeradorPdfEntity s3 = new GeradorPdfEntity(null,"Maria", "maria@gmail.com", "21-11111-1111", "Endereço 1", "12345678900", "Multifocal", "-1.00", "-1.50", "30", "30", "+1.50", "Solar com Ar", "Data do Exame 1", "100,00");
        geradorPdfEntity.add(s1);
       // geradorPdfEntity.add(s2);
        //geradorPdfEntity.add(s3);

        try {
            FileOutputStream outputStream = new FileOutputStream(filePdf);
            PdfWriter writer = new PdfWriter(outputStream);
            PdfDocument pdfDocument = new PdfDocument(writer);
            Document document = new Document(pdfDocument);
            Paragraph p1 = new Paragraph("Imprimir pedido");

            float[] columnWidth = {100f, 100f, 100f, 100f, 100f};
            Table table = new Table(columnWidth);
            table.addCell(new Cell().add("Número do pedido:").setBold());
            table.addCell(new Cell().add(String.valueOf(geradorPdfEntity.get(0).getId())));
            table.addCell(new Cell().add(""));
            table.addCell(new Cell().add(""));
            table.addCell(new Cell().add(""));
            table.addCell(new Cell().add("Dados Pessoais:").setBold());
            table.addCell(new Cell().add(""));
            table.addCell(new Cell().add(""));
            table.addCell(new Cell().add(""));
            table.addCell(new Cell().add(""));
            table.addCell(new Cell().add("Nome: " + geradorPdfEntity.get(0).getNome()));
            table.addCell(new Cell().add("CPF: " + geradorPdfEntity.get(0).getCpf()));
            table.addCell(new Cell().add("Email: " + geradorPdfEntity.get(0).getEmail()));
            table.addCell(new Cell().add("Telefone: " + geradorPdfEntity.get(0).getTelefone()));
            table.addCell(new Cell().add("Endereço: " + geradorPdfEntity.get(0).getEndereco()));
            table.addCell(new Cell().add("Dados do Exame: ").setBold());
            table.addCell(new Cell().add("Olho Direito:         " + geradorPdfEntity.get(0).getOlho_Direito()));
            table.addCell(new Cell().add("OD:DP/DNP Altura: " + geradorPdfEntity.get(0).getDp_Olho_Direito()));
            table.addCell(new Cell().add(""));
            table.addCell(new Cell().add(""));
            table.addCell(new Cell().add(""));
            table.addCell(new Cell().add("Olho Esquerdo:        " + geradorPdfEntity.get(0).getOlho_Esquerdo()));
            table.addCell(new Cell().add("OE:DP/DNP Altura: " + geradorPdfEntity.get(0).getDp_Olho_Esquerdo()));
            table.addCell(new Cell().add(""));
            table.addCell(new Cell().add(""));
            table.addCell(new Cell().add("Tipo de Lentes: " + geradorPdfEntity.get(0).getTipo()).setBold());
            table.addCell(new Cell().add(""));
            table.addCell(new Cell().add(""));
            table.addCell(new Cell().add(""));
            table.addCell(new Cell().add(""));
            table.addCell(new Cell().add("Adição: " + geradorPdfEntity.get(0).getAdicao()).setBold());
            table.addCell(new Cell().add(""));
            table.addCell(new Cell().add(""));
            table.addCell(new Cell().add(""));
            table.addCell(new Cell().add(""));
            table.addCell(new Cell().add("Lentes: " + geradorPdfEntity.get(0).getLentes()).setBold());
            table.addCell(new Cell().add(""));
            table.addCell(new Cell().add(""));
            table.addCell(new Cell().add(""));
            table.addCell(new Cell().add(""));
            table.addCell(new Cell().add(""));
            table.addCell(new Cell().add(""));
            table.addCell(new Cell().add(""));
            table.addCell(new Cell().add(""));
            table.addCell(new Cell().add("Valor: " + geradorPdfEntity.get(0).getValor()).setBold());


            document.add(p1);
            document.add(table);
            document.close();
            pdfDocument.close();
            writer.close();
        } catch (FileSystemNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
