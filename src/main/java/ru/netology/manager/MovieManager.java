package ru.netology.manager;

import ru.netology.domain.MovieItem;

public class MovieManager {

    private MovieItem[] items = new MovieItem[0];

    public void add(MovieItem item) {
        // создаём новый массив размером на единицу больше
        int length = items.length + 1;
        MovieItem[] tmp = new MovieItem[length];

        System.arraycopy(items, 0, tmp, 0, items.length);

        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public MovieItem[] getAll() {
        MovieItem[] result = new MovieItem[items.length];
        // перебираем массив в прямом порядке
        // но кладём в результаты в обратном
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }

    // наивная реализация
    public void removeById(int id) {
        int length = items.length - 1;
        MovieItem[] tmp = new MovieItem[length];
        int index = 0;
        for (MovieItem item : items) {
            if (item.getId() != id) {
                tmp[index] = item;
                index++;
            }
        }
        // меняем наши элементы
        items = tmp;
    }

}
