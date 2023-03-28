package personagem;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class PersonagemTest {
    

    @Test
    public void returnName(){
        Personagem.getInstance().setNomePersonagem("Cuca B3lludo");
        assertEquals("Cuca B3lludo", Personagem.getInstance().getNomePersonagem());
    }



    @Test
    public void returnNivel(){
        Personagem.getInstance().setNivelPersonagem(20);
        assertEquals(20, Personagem.getInstance().getNivelPersonagem());
    }



    @Test
    public void showNivel(){
        Personagem.getInstance().setNivelPersonagem(20);
        assertEquals(
                "O Nível do personagem é " + Personagem.getInstance().getNivelPersonagem(),
                Personagem.getInstance().exibirNivelDoPersonagem()
        );
    }

}