package ru.chirikhin.engearn.network.volabulary;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("words")
public class VocabularyController {
    private final VocabularyService vocabularyService;

    @PostMapping
    public void addWord(@RequestBody AddWordRequest addWordRequest) {
        vocabularyService.addWord(addWordRequest.getWord());
    }
}
