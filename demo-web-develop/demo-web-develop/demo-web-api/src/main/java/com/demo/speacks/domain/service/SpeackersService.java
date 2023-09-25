package com.demo.speacks.domain.service;

import com.demo.speacks.domain.model.Speakers;
import com.demo.speacks.infrastructure.repository.SpeackRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SpeackersService implements ISpeackersService {

    private final SpeackRepository speackRepository;

    @Override
    public Page<Speakers> getAll(Pageable pageable) {
        return speackRepository.findAll(pageable);
    }

    @Override
    public Speakers insert(Speakers speakers) {
        return speackRepository.save(speakers);
    }

    @Override
    public Speakers update(Long id, Speakers speakers) {
        speakers.setId(id);
        return speackRepository.save(speakers);
    }

    @Override
    public Boolean remove(Long id) {
        try {
            speackRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public Boolean removeAll() {
        try {
            speackRepository.deleteAll();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public Optional<Speakers> findById(Long id) {
        return speackRepository.findById(id);
    }
}
