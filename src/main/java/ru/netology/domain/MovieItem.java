package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MovieItem {
    private int id;
    private int MovieId;
    private String movieName;
    private int maxCount = 9;

    public MovieItem(int maxCount) {
        this.maxCount = maxCount;
    }
}