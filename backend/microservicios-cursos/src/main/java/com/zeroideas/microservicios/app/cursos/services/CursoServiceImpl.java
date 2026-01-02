package com.zeroideas.microservicios.app.cursos.services;

import com.zeroideas.microservicios.app.cursos.models.entity.Curso;
import com.zeroideas.microservicios.app.cursos.models.repository.CursoRepository;
import com.zeroideas.microservicios.commons.services.CommonServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class CursoServiceImpl extends CommonServiceImpl<Curso, CursoRepository> implements CursoService {
}
