public class Ex4 {
    String nome;

    public Ex4(String nome) {
        this.nome = nome;
    }

    public void saudacao() {
        System.out.println("Ola meu nome é " + nome);
    }

    public static void main(String[] args) {
        Ex4 pessoa = new Ex4("Iago");
        pessoa.saudacao();
    }

}
