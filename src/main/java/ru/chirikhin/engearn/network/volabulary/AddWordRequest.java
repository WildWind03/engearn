package ru.chirikhin.engearn.network.volabulary;

import lombok.Data;
import ru.chirikhin.engearn.model.Word;

@Data
class AddWordRequest {
    private Word word;
}
