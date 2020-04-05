package ru.chirikhin.engearn.vocabulary;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
class VocabularyService {

    private final WordRepository wordRepository;

    @Transactional
    public void addWord(Word word) {
        wordRepository.save(word);
    }
}
