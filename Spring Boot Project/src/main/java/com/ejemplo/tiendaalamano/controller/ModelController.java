package com.ejemplo.tiendaalamano.controller;

import com.ejemplo.tiendaalamano.model.Model;
import com.ejemplo.tiendaalamano.service.ModelService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ModelController {
    @Autowired
    private ModelService modelService;

    @RequestMapping(value = "/model", method = RequestMethod.POST, consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public void createNewModel(@RequestBody @Validated Model model) {
        modelService.createModel(model);
    }

    @RequestMapping(value = "/erase", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deleteAllModels() {
        modelService.deleteAllModels();
    }

    @RequestMapping(value = "/model/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deleteModelById(@RequestParam Long id) {
        modelService.deleteModelById(id);
    }

    @RequestMapping(value = "/model", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Model> getAllModels() {
        return modelService.getAllModels();
    }

    @RequestMapping(value = "/model/{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Model getModelById(Long id) {
        return modelService.getModelById(id);
    }
}
