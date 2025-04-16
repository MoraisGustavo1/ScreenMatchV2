package br.com.screenmatch.screenmatchv2.services;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
