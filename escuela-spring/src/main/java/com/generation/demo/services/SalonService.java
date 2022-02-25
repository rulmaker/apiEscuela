package com.generation.demo.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.demo.models.SalonModel;
import com.generation.demo.repositories.SalonRepository;


@Service
public class SalonService{
	
	private final SalonRepository salonRepository;
	
	public SalonService(@Autowired SalonRepository salonRepository) {
		this.salonRepository = salonRepository;
	}
	
	//obtener y mostrar elementos
	public ArrayList<SalonModel> obtenerDatos(){
		return (ArrayList<SalonModel>) salonRepository.findAll();
	}
	
	//Guardar datos
	public SalonModel guardarDatos(SalonModel salonModel) {
		return salonRepository.save(salonModel);
	}
	
	//Eliminar datos
	public boolean eliminarDato(Integer id) {
		try {
			salonRepository.deleteById(id);
			return true;
		}catch(Exception error) {
			return false;
		}
	}
	
	
}
