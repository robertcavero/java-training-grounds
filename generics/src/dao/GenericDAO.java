package dao;

import domain.GenericDomain;
import domain.UserDomain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public abstract class GenericDAO<ID, T extends GenericDomain<ID>> {

    /*
    Esse DAO vai ter que receber 2 tipos genericos
    Esse ID (livre) e o segundo parametro tem que extender o
    GenericDomain que vai ter o mesmo tipo
     */

    private final List<T> db = new ArrayList<>();

    private T save(T domain){
        db.add(domain);
        return domain;
    }

    public boolean save(int batch, T... domains){
        System.out.printf("Salvando em lote [%s] \n", batch);
        return db.addAll(Arrays.stream(domains).toList());

    }

    public T update(ID id, T domain){
        var stored = find(d -> d.getId().equals(id)).orElseThrow();

                /*db.stream().filter(d -> d.getId().equals(id))
                .findFirst()
                .orElseThrow();*/

        db.remove(stored);
        return save(domain);
    }

    public boolean delete(T domain){
        return db.remove(domain);
    }

    public Optional<T> find(Predicate<T> filterCallback){
        return db.stream().filter(filterCallback).findFirst();

    }

    public List<T> findAll(){
        return db;
    }

    public int count(){
        return db.size();
    }

}
