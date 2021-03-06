package ru.netlolgy;


public class AfishaManager {
    private int amountFilms = 10;
    private FilmData[] films = new FilmData[0];

    public FilmData[] getFilms() {
        return films;
    }

    public void setFilms(FilmData[] films) {
        this.films = films;
    }


    public AfishaManager() {

    }

    public AfishaManager(int amountFilms) {
        this.amountFilms = amountFilms;
    }


    public void add1(FilmData film) {
        int length = films.length + 1;
        FilmData[] tmp = new FilmData[length];
        System.arraycopy(films, 0, tmp, 0, films.length);
        int lastFilm = tmp.length - 1;
        tmp[lastFilm] = film;
        films = tmp;

    }

    public FilmData[] findAll() {
        return getFilms();

    }

    public void getLast() {
        int  resultLength;
        if (amountFilms > films.length) {
            resultLength = films.length;
        } else {
            resultLength = amountFilms;
        }

        FilmData[] tmp = new FilmData[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            int index = films.length - i - 1;
            tmp[i] = films[index];
        }
        films = tmp;


    }


}

