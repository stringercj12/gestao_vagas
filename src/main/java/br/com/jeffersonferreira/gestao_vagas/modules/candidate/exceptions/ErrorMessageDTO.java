package br.com.jeffersonferreira.gestao_vagas.modules.candidate.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorMessageDTO {

    private String message;
    private String field;

}
