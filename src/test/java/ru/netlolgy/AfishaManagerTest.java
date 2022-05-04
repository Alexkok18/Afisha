package ru.netlolgy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AfishaManagerTest {
    FilmData first = new FilmData("Saw1", 1, "horror");
    FilmData second = new FilmData("Saw2", 2, "horror");
    FilmData third = new FilmData("Saw3", 3, "horror");
    FilmData fourth = new FilmData("Saw4", 4, "horror");
    FilmData fifth = new FilmData("Saw5", 5, "horror");
    FilmData sixth = new FilmData("Saw6", 6, "horror");
    FilmData seventh = new FilmData("Saw7", 7, "horror");
    FilmData eighth = new FilmData("Saw8", 8, "horror");
    FilmData ninth = new FilmData("Saw9", 9, "horror");
    FilmData tenth = new FilmData("Saw10", 10, "horror");
    FilmData eleventh = new FilmData("Saw11", 11, "horror");


    @Test
    void shouldAdd1Films() {
        AfishaManager manager = new AfishaManager();
        FilmData[] testAdd1 = {first};
        FilmData[] testAdd2 = {first, second};

        manager.setFilms(testAdd1);
        manager.add1(second);
        FilmData[] actual = manager.getFilms();
        assertArrayEquals(testAdd2, actual);
    }

    @Test
    void shouldAdd1FilmsTo0() {
        AfishaManager manager = new AfishaManager();
        FilmData[] test = new FilmData[0];
        FilmData[] testAdd1 = {first};

        manager.setFilms(test);
        manager.add1(first);
        FilmData[] actual = manager.getFilms();
        assertArrayEquals(testAdd1, actual);
    }


    @Test
    void shouldFindAll() {
        AfishaManager manager = new AfishaManager();
        FilmData[] testFindAll = {first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh};
        FilmData[] testExpectedFindAll = {first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh};
        manager.setFilms(testFindAll);
        manager.findAll();
        FilmData[] actual = manager.getFilms();
        assertArrayEquals(testExpectedFindAll, actual);


    }


    @Test
    void shouldFindLast10() {
        AfishaManager manager = new AfishaManager();
        FilmData[] testFindAll = {first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh};
        FilmData[] testExpectedFindLast10 = {eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};
        manager.setFilms(testFindAll);
        manager.getLast();
        FilmData[] actual = manager.getFilms();

        assertArrayEquals(testExpectedFindLast10, actual);


    }

    @Test
    void shouldFindLast5() {
        AfishaManager manager = new AfishaManager(5);
        FilmData[] testFindAll = {first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh};
        FilmData[] testExpectedFindLast5 = {eleventh, tenth, ninth, eighth, seventh,};
        manager.setFilms(testFindAll);
        manager.getLast();
        FilmData[] actual = manager.getFilms();

        assertArrayEquals(testExpectedFindLast5, actual);


    }

    @Test
    void shouldFindLast12() {
        AfishaManager manager = new AfishaManager(12);
        FilmData[] testFindAll = {first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth,eleventh};
        FilmData[] testExpectedFindLast12 = {eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        manager.setFilms(testFindAll);
        manager.getLast();
        FilmData[] actual = manager.getFilms();

        assertArrayEquals(testExpectedFindLast12, actual);


    }

    @Test
    void shouldFindLast0() {
        AfishaManager manager = new AfishaManager(0);
        FilmData[] testFindAll = {first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth};
        FilmData[] testExpectedFindLast12 = new FilmData[0];
        manager.setFilms(testFindAll);
        manager.getLast();
        FilmData[] actual = manager.getFilms();

        assertArrayEquals(testExpectedFindLast12, actual);


    }


}
