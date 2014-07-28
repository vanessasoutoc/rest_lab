package br.com.alura.loja;

import java.io.IOException;
import java.net.URI;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

public class Servidor {

    public static final String HTTP_LOCALHOST = "http://localhost:8080/";
    private static ResourceConfig config = new ResourceConfig().packages("br.com.alura.loja");
    private static HttpServer server;

    public static void main(final String[] args) throws IOException {



        inicializaServidor();
        System.in.read();
        stopServidor();
    }

    public static void stopServidor() {
        server.stop();
    }

    public static void inicializaServidor() {
        final URI uri = URI.create(HTTP_LOCALHOST);
        server = GrizzlyHttpServerFactory.createHttpServer(uri, config);
        System.out.println("Servidor rodando");
    }


}
