package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.MovieItem;

import static org.junit.jupiter.api.Assertions.*;

class MovieManager {
    @Test
    public void shouldRemoveIfExists() {
        MovieManager manager = new MovieManager();
        int idToRemove = 1;
        MovieItem first = new MovieItem(1, 1, "RED", 1);
        MovieItem second = new MovieItem(2, 2, "SAW", 1);
        MovieItem third = new MovieItem(3, 3, "Love Actually", 1);
        MovieItem fourth = new MovieItem(4, 4, "VHS", 1);
        MovieItem fifth = new MovieItem(5, 5, "SAW2", 1);

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);


        manager.removeById(idToRemove);

        MovieItem[] actual = manager.getAll();
        MovieItem[] expected = new MovieItem[]{third, second};

//    assertEquals(expected, actual);
        assertArrayEquals(expected, actual);
    }

    public void add(MovieItem first) {
    }

    public void removeById(int idToRemove) {
    }

    public MovieItem[] getAll() {
        return new MovieItem[0];
    }


}

