package ru.chirikhin.engearn.network.volabulary;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.chirikhin.engearn.model.Word;

@Service
@AllArgsConstructor
class VocabularyService {

    private final WordDao wordDao;

    @Transactional
    public void addWord(Word word) {
        wordDao.save(word);
    }
}
