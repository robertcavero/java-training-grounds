package dio.taskmanager.application.input;


import java.util.Optional;

/*
É recomendadp usar records para DTOs pela imutabilidade
 */
public record CreateTaskInput(String title, Optional<String> description) {

}
