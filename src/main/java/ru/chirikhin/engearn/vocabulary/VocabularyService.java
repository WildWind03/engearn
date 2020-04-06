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
        WordEntity wordEntity = new WordEntity();
        wordEntity.setValue(word.getValue());
        wordEntity.setCategory(buildCategoryEntity(word.getCategory()));
        wordRepository.save(wordEntity);
    }

    private CategoryEntity buildCategoryEntity(Category category) {
        CategoryEntity categoryEntity = new CategoryEntity();
        categoryEntity.setName(category.getName());
        return categoryEntity;
    }
}
