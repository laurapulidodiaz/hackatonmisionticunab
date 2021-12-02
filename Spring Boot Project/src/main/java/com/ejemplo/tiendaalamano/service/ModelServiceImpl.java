package com.ejemplo.tiendaalamano.service;

import com.ejemplo.tiendaalamano.model.Model;
import com.ejemplo.tiendaalamano.repository.ModelRepository;
import com.ejemplo.tiendaalamano.exception.BadResourceRequestException;
import com.ejemplo.tiendaalamano.exception.NoSuchResourceFoundException;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("modelService")
public class ModelServiceImpl implements ModelService {
    @Autowired
    private ModelRepository modelRepository;

    @Override
    public void deleteAllModels() {
        modelRepository.deleteAllInBatch();
    }

    @Override
    public void deleteModelById(Long id) {
        modelRepository.deleteById(id);
    }

    @Override
    public void createModel(Model model) {
        Optional<Model> existingModel = modelRepository.findById(model.getId());

        if (!existingModel.isPresent()) {
            throw new BadResourceRequestException("Model with same id exists.");
        }

        modelRepository.save(model);
    }

    @Override
    public Model getModelById(Long id) {
        Optional<Model> model = modelRepository.findById(id);

        if (!model.isPresent()) {
            throw new NoSuchResourceFoundException("No model with given id found.");
        }

        return model.get();
    }

    @Override
    public List<Model> getAllModels() {
        return modelRepository.findAll();
    }
}
