package ru.chirikhin.engearn.network.volabulary;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.chirikhin.engearn.model.Word;

public interface WordDao extends JpaRepository<Word, String> {
}
