package com.facu.restfake.RestfakeApplication.controllers;

import com.facu.restfake.RestfakeApplication.entities.Autor;
import com.facu.restfake.RestfakeApplication.entities.Persona;
import com.facu.restfake.RestfakeApplication.services.AutorServiceImpl;
import com.facu.restfake.RestfakeApplication.services.PersonaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/autores")
public class AutorController extends BaseControllerImpl <Autor, AutorServiceImpl>{
}
