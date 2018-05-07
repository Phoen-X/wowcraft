package com.iredko.wowcraft.intr;

import java.util.List;

public interface GenericManagerInterface<T> {

    public List<T> findAll();

    public T update(T object);

    public T findById(Long id);

    public void delete(T object);

    public void insert(T object);

    public boolean exist(Long id);
}
