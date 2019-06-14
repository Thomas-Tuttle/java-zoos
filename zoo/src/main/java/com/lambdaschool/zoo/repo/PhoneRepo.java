package com.lambdaschool.zoo.repo;

import com.lambdaschool.zoo.model.Phone;
import org.springframework.data.repository.CrudRepository;

public interface PhoneRepo extends CrudRepository<Phone, Long>
{

}
