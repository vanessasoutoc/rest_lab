package br.com.alura.loja;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import org.junit.After;
import org.junit.Before;

import com.thoughtworks.xstream.XStream;

public class RestTest<T> {

    protected final Client client = ClientBuilder.newClient();
    protected final WebTarget target = this.client.target(Servidor.HTTP_LOCALHOST);

    @Before
    public void iniciarServidor() {
        Servidor.inicializaServidor();
    }

    @After
    public void stopServidor() {
        Servidor.stopServidor();
    }

    public T getXML(final String conteudo) {
        return (T) new XStream().fromXML(conteudo);
    }

}
