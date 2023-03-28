package personagem;


public class Personagem {


    private Personagem() {};
    private static Personagem instance = new Personagem();
    public static Personagem getInstance() {
        return instance;
    }

    private String nome;
    private int nivel;

    public String getNomePersonagem() {
        return nome;
    }

    public void setNomePersonagem(String personagemNome) {
        this.nome = personagemNome;
    }

    public int getNivelPersonagem() {
        return nivel;
    }

    public void setNivelPersonagem(int personagemNivel) {
        this.nivel = personagemNivel;
    }

    public String exibirNivelDoPersonagem() {
        return "O Nível do personagem é " + this.nivel;
    }
}