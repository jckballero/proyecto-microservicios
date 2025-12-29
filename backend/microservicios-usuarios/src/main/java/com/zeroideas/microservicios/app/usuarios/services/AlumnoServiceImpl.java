package com.zeroideas.microservicios.app.usuarios.services;

import com.zeroideas.microservicios.app.usuarios.models.entity.Alumno;
import com.zeroideas.microservicios.app.usuarios.models.repository.AlumnoRepository;
import com.zeroideas.microservicios.commons.services.CommonServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class AlumnoServiceImpl extends CommonServiceImpl<Alumno, AlumnoRepository> implements AlumnoService{

}