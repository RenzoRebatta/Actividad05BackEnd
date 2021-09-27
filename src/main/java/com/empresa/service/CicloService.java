package com.empresa.service;

import java.util.List;

import com.empresa.entity.Ciclo;

public interface CicloService {

	public Ciclo insertaActualizaCiclo(Ciclo obj);

	public List<Ciclo> listaCiclo();
}
