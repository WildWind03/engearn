package ru.chirikhin.engearn.vocabulary;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
class WordEntity {
    @Id
    @GeneratedValue
    private Integer id;

    private String value;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "word_id", nullable = false)
    private CategoryEntity category;
}
