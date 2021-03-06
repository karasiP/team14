package sut.se.g14.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import sut.se.g14.entity.*;
import sut.se.g14.repository.TypePrivilegeRepository;

import java.util.Collection;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class TypePrivilegeController {
    @Autowired
    private TypePrivilegeRepository typePrivilegeRepository;

    @GetMapping(path = "/typePrivilege")
    public Collection<TypePrivilege> getTypePrivilege(){
        return typePrivilegeRepository.findAll().stream().collect(Collectors.toList());
    }
}

