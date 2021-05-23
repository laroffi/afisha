package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.MovieItem;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class CartManagerTestNonEmptyWithSetup {
    private MovieManager manager = new MovieManager();
    private MovieItem first = new MovieItem(1, 1, "RED", 1);
    private MovieItem second = new MovieItem(2, 2, "SAW", 1);
    private MovieItem third = new MovieItem(3, 3, "Love Actually", 1);
    private MovieItem fourth = new MovieItem(4, 4, "VHS", 1);
    private MovieItem fifth = new MovieItem(5, 5, "SAW2", 1);
    private MovieItem sixth = new MovieItem(6, 6, "Frozen", 1);
    private MovieItem seventh = new MovieItem(7, 7, "FrozenII", 1);
    private MovieItem eighth = new MovieItem(8, 8, "Loosers", 1);
    private MovieItem ninth = new MovieItem(9, 9, "Twins", 1);
    private MovieItem tenth = new MovieItem(10, 10, "Friends", 1);


    @BeforeEach
    public void setUp() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
    }

    @Test
    public void shouldRemoveIfExists() {

        int idToRemove = 1;
        manager.removeById(idToRemove);

        MovieItem[] actual = manager.getAll();
        MovieItem[] expected = new MovieItem[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};

//    assertEquals(expected, actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowWhatsThere() {
        MovieItem item = new MovieItem(3);

        MovieItem[] actual = manager.getAll();
        MovieItem[] expected = new MovieItem[]{fourth, third, second, first};

    }




}