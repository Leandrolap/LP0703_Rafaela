package br.newtonpaiva.linguagem.aula05;

public class Agenda {
    public static  void main(String[] args){

        Telefone telefone = new Telefone();
        Telefone telefone2 = new Telefone();
        Telefone telefone3 = new Telefone();

        Contato contato1 = new Contato();
        Contato contato2 = new Contato();
        Contato contato3 = new Contato();

        contato1.nome = "Dayane";
        contato1.telefone = "949494939";
        contato2.nome = "Ana";
        contato2.telefone = "755439292";
        contato3.nome = "Leandro";
        contato3.telefone = "1223443443";

        telefone.Marca1 = "Iphone";
        telefone.Marca2 = "Samsung";

        telefone.Cor1 = "Dourado";
        telefone2.Cor2 = "Vermelho";
        telefone3.Cor3 = "Azul";

        telefone.contato = contato1;

        telefone.Tocar("Eletônica");

        System.out.println(telefone.contato.nome + " " + telefone.contato.telefone + telefone.Cor1 + telefone.Marca1);
        System.out.println(telefone2.contato.nome + " " + telefone2.contato.telefone + telefone2.Cor2 + telefone2.Marca2);
        System.out.println(telefone3.contato.nome + " " + telefone2.contato.telefone + telefone3.Cor3 + telefone3.Marca3);

    }
}
