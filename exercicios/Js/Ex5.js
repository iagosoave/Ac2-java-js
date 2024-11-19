class Pessoa {
    constructor(nome) {
        this.nome = nome;
    } saudacao() {
        console.log("Olá meu nome é " + this.nome);
    }
}
const pessoa = new Pessoa("Iago");
pessoa.saudacao();