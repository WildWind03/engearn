package ru.chirikhin.engearn.vocabulary;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
class Word {
    @Id
    private String value;
}
