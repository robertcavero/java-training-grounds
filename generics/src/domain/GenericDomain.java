package domain;

import java.util.Objects;

public interface GenericDomain<T> {
//    private T id;

   /* public GenericDomain() {

    }
    public GenericDomain(T id) {
        this.id = id;
    }*/

    T getId();

    void setId(T id);





    /*@Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        GenericDomain<?> that = (GenericDomain<?>) object;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }


    @Override
    public String toString() {
        return "GenericDomain{" +
                "id=" + id +
                '}';
    }*/
}
