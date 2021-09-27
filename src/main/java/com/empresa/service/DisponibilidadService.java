package com.empresa.service;

import java.util.List;

import com.empresa.entity.Disponibilidad;

public interface DisponibilidadService {

	public abstract Disponibilidad insertaActualizaDisponibilidad(Disponibilidad obj);

	public abstract List<Disponibilidad> listaDisponibilidad();
}
