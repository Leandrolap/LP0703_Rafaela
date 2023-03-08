package br.newtonpaiva.linguagem.aula05;

public class Telefone {
    Contato contato;
    public String Marca1;
    public String Cor1;

    public String Marca2;
    public String Cor2;

    public String Marca3;
    public String Cor3;

    public void Tocar(String estiloMusical){
        System.out.println("Tocando" + estiloMusical)
    }

    public void Ligar(Contato cont){
        if (this.Cor1.equals("Preto"))
            System.out.println("Ligando para " + cont.nome);
        else
            System.out.println("Telefone indisponível");
    }
}

}
