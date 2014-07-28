package br.com.alura.loja;

import junit.framework.Assert;

import org.junit.Test;

import br.com.alura.loja.modelo.Carrinho;

public class ClienteTest extends RestTest<Carrinho> {



    @Test
    public void testaQueBuscarUmCarrinhoTrazUmCarrinhoEsperado() {

        final String conteudo = this.target.path("/carrinhos/1").request().get(String.class);
        final Carrinho carrinho = getXML(conteudo);
        final Long recebeId = carrinho.getId();
        System.out.println(recebeId.equals(carrinho.getId()));
        Assert.assertEquals(1, carrinho.getId());
        System.out.println(conteudo);
    }

}
