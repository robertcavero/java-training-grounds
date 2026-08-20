package dio.taskmanager.domain;


import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/*
Qual a ideia desse padrão de projeto?
O repository e uma abstração da nossa camada de armazenamento,
seja um banco de dados, um arquivo, seja em memória,que é o caso aqui.
Seguindo o domain driven design, nosso TaskRepository vai ficar dentro
da camada de domínio. Por quê? Porque o domínio e o que contem a regra de negócio

*/
@Repository
public interface TaskRepository {
    Task save(Task task);
    List<Task> findAll();
    Optional<Task> findById(TaskId id);
    void deleteById(TaskId id);
}
