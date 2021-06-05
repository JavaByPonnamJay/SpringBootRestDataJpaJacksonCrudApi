package javaconceptsbyjay.com.youtube.service;

import javaconceptsbyjay.com.youtube.entity.Singers;

import java.util.List;

public interface SingersService {
    // create
    public Integer saveSingers(Singers singers);
    // update
    public void update(Singers singers);

    // delete
    public void delete(Integer id);

    // retrieve / fetch
    public Singers getOneSinger(Integer id);

    public List<Singers> getAllSingers();

    public boolean isAvailable(Integer id);
}
