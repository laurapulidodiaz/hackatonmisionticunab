package com.ejemplo.tiendaalamano.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Model implements Serializable {
	private static final long serialVersionUID = -3904417485279370766L;

	@Id
    private Long id;

    private String name;

    public Model() {
    }

    public Model(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
