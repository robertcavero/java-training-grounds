package dio.taskmanager.domain;

import org.springframework.util.Assert;

import java.io.Serializable;
import java.util.UUID;

//razão de existência: extensibilidade
public record TaskId(UUID id) {
    /*
    Lembre-se, records são imutáveis
     */

    public TaskId {
        Assert.notNull(id, "id must not be null");
    }

    public TaskId() {
        this(UUID.randomUUID());
    }


}
