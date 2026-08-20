package dio.taskmanager.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.Assert;

import java.util.Optional;


@Getter
@Setter
public class Task {
    private TaskId id;
    private String title;
    private Optional<String> description;
    private TaskStatus status;

    public Task(String title, Optional<String> description) {
        /*
        this.id = id;

        Não vamos passar um ID, queremos que ela crie um ID sozinha,
        por isso criamos o construtor em TaskId.java que vai fazer isso.
        * */

        Assert.notNull(title, "title must not be null");

        this.id = new TaskId();
        this.title = title;
        this.description = description;

        /*
        Como estamos criando a Task, definimos um status padrão
        que é pending
        */
        this.status = TaskStatus.PENDING;

    }

    public void update(Optional<String> title, Optional<String> description, Optional<TaskStatus> status) {
        /*title.isPresent(this::setTitle);
        description.isPresent(d -> this.setDescription(Optional.of(d)));
        status.isPresent(this::setStatus);*/

        title.ifPresent(this::setTitle);
        description.ifPresent(d -> this.setDescription(Optional.of(d)));
        status.ifPresent(this::setStatus);
    }

}
