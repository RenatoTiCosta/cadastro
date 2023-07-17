function gerarPDF() {
    var doc = new jsPDF();
    doc.text('Dados Pessoais:', 10, 10);
    doc.text('ID: ' + document.getElementById('id').value, 10, 20);
    doc.text('Nome: ' + document.getElementById('nome').value, 10, 30);
    doc.text('Email: ' + document.getElementById('email').value, 10, 40);
    doc.text('Telefone: ' + document.getElementById('telefone').value, 10, 50);
    doc.text('Endereço: ' + document.getElementById('endereco').value, 10, 60);
    doc.text('CPF: ' + document.getElementById('cpf').value, 10, 70);
    //
    doc.text('Dados do Exame:', 10, 80);
    doc.text('Tipo: ' + document.getElementById('tipo').value, 10, 90);
    doc.text('Grau Olho Direito: ' + document.getElementById('oD').value, 10, 100);
    doc.text('Grau Olho Esquerdo: ' + document.getElementById('oE').value, 10, 110);
    doc.text('Olho Direito - DP/DNP - Altura: ' + document.getElementById('dPOd').value, 10, 120);
    doc.text('Olho Esquerdo - DP/DNP - Altura: ' + document.getElementById('dPOe').value, 10, 130);
    doc.text('Adição: ' + document.getElementById('adicao').value, 10, 140);
    doc.text('Lentes: ' + document.getElementById('lentes').value, 10, 150);
    doc.text('Exame: ' + document.getElementById('exame').value, 10, 160);
    //
    doc.text('Pagamento:', 10, 60);
    doc.text('Valor: ' + document.getElementById('valor').value, 10, 170);
    //
    doc.text('Data: ' + document.getElementById('data').value, 10, 90);
    doc.save('arquivo.pdf');
}

