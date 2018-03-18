package com.snailmann.springboot.service;

import com.snailmann.springboot.dao.WomanRepository;
import com.snailmann.springboot.entity.Woman;
import com.snailmann.springboot.enums.ResultEnum;
import com.snailmann.springboot.exception.WomanException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * service layer
 */

@Service
public class WomanService {

    @Autowired
    private WomanRepository womanRepository;

    /**
     * @Transactional work only for runtime exceptions by defaul
     * it work for checked exception when you set rollbackFor=Exception.class
     */
    @Transactional(rollbackFor = Exception.class)
    public void insertTwo() {
        Woman womanA = new Woman();
        womanA.setAge(24);
        womanA.setCupSize("A");
        womanRepository.save(womanA);

        Woman womanB = new Woman();
        womanB.setAge(23);
        womanB.setCupSize("BBBBBBBBBBBBBBBBBBBBB");
        womanRepository.save(womanB);

    }

    /**
     * learn to using Exception to feedback message
     * @param id
     */
    public void getAge(Integer id) throws Exception{
        Woman woman = womanRepository.findById(id).get();
        Integer age = woman.getAge();
        if (age < 10) {
            //return "Maybe you still in primary school"
            throw new WomanException(ResultEnum.PRIMARY_SHCOOL);//errorCode:100
        } else if (age > 10 && age < 16) {
            //return "Maybe you still in junior high school"
            throw new WomanException(ResultEnum.HIGN_SCHOOL);//errorCode:101
        }
        //other operation...etc
    }
}
