package javaconceptsbyjay.com.youtube.service;

import javaconceptsbyjay.com.youtube.entity.Singers;
import javaconceptsbyjay.com.youtube.repository.SingersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SingersServiceImpl implements  SingersService{

    @Autowired
    private SingersRepository singersRepository;

    @Override
    @Transactional
    public Integer saveSingers(Singers singers) {
        return singersRepository.save(singers).getSingersPosition();
    }

    @Override
    @Transactional
    public void update(Singers singers) {
     singersRepository.save(singers);
    }

    @Override
    @Transactional
    public void delete(Integer id) {
    singersRepository.deleteById(id);
    }

    @Override
    @Transactional
    public Singers getOneSinger(Integer id) {
        return singersRepository.findById(id).orElse(null);
    }

    @Override
    public List<Singers> getAllSingers() {
        return singersRepository.findAll();
    }

    @Override
    @Transactional
    public boolean isAvailable(Integer id) {
        return singersRepository.existsById(id);
    }
}
