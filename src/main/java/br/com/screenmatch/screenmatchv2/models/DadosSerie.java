package br.com.screenmatch.screenmatchv2.models;

import com.fasterxml.jackson.annotation.JsonAlias;

public record DadosSerie(
        @JsonAlias("Title") String titulo,
        @JsonAlias("totalSeasons") int totalTemporadas,
        @JsonAlias("imdbRating") String avaliacao) {
}
