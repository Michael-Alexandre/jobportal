package com.mike.jobportal.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mike.jobportal.entity.UsersType;
import com.mike.jobportal.repository.UsersTypeRepository;

@Service
public class UsersTypeService {

    private final UsersTypeRepository usersTypeRepository;

  //  @Autowired
    public UsersTypeService(UsersTypeRepository usersTypeRepository) {
        this.usersTypeRepository = usersTypeRepository;
    }

    public List<UsersType> getAll() {
        return usersTypeRepository.findAll();
    }
    
}
