package ru.chirikhin.engearn.model;

import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
public class Word {
    @Id
    private String value;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Category> categoryList;
}
