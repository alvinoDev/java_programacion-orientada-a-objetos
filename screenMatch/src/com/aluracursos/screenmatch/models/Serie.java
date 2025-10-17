package com.aluracursos.screenmatch.models;

public class Serie extends Title {
    private int seasons;
    private int episodesSeason;
    private int minutesEpisode;

    public Serie(String name, int releaseDate) {
        super(name, releaseDate);
    }

    @Override
    public int getDurationInMinutes() {
        return seasons * episodesSeason * minutesEpisode;
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public int getEpisodesSeason() {
        return episodesSeason;
    }

    public void setEpisodesSeason(int episodesSeason) {
        this.episodesSeason = episodesSeason;
    }

    public int getMinutesEpisode() {
        return minutesEpisode;
    }

    public void setMinutesEpisode(int minutesEpisode) {
        this.minutesEpisode = minutesEpisode;
    }
}
