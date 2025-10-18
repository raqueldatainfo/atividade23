package atleta.Atleta;

    public class Atleta {
    // Atributos privados
    private String nome;
    private String modalidade;
    private int idade;
    private double pesoEmKg;
    private double alturaEmMetros;

    // Construtor
    public Atleta(String nome, String modalidade, int idade, double pesoEmKg, double alturaEmMetros) {
        this.nome = nome;
        this.modalidade = modalidade;
        this.idade = idade;
        this.pesoEmKg = pesoEmKg;
        this.alturaEmMetros = alturaEmMetros;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPesoEmKg() {
        return pesoEmKg;
    }

    public void setPesoEmKg(double pesoEmKg) {
        this.pesoEmKg = pesoEmKg;
    }

    public double getAlturaEmMetros() {
        return alturaEmMetros;
    }

    public void setAlturaEmMetros(double alturaEmMetros) {
        this.alturaEmMetros = alturaEmMetros;
    }

    // Método para calcular IMC (Peso / Altura²)
    public double calcularIMC() {
        return pesoEmKg / (alturaEmMetros * alturaEmMetros);
    }

    // Método para classificar a categoria do atleta
    public String classificarCategoria() {
        if (modalidade.equalsIgnoreCase("futebol")) {
            if (idade < 12) return "Sub-12";
            else if (idade < 15) return "Sub-15";
            else if (idade < 18) return "Sub-18";
            else return "Adulto";
        } else if (modalidade.equalsIgnoreCase("natação")) {
            if (idade < 10) return "Infantil";
            else if (idade < 14) return "Juvenil";
            else if (idade < 18) return "Júnior";
            else return "Sênior";
        } else {
            return "Categoria não definida para esta modalidade.";
        }
    }
}



}
