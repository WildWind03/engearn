package ru.chirikhin.engearn.vocabulary;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("words")
public class VocabularyController {
    private final VocabularyService vocabularyService;

    @PutMapping
    public void addWord(@RequestBody Word word) {
        vocabularyService.addWord(word);
    }
}
