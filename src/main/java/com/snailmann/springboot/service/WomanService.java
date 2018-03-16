package com.snailmann.springboot.service;

import com.snailmann.springboot.dao.WomanRepository;
import com.snailmann.springboot.entity.Woman;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *  service layer
 *
 */

@Service
public class WomanService {

    @Autowired
    private WomanRepository womanRepository;

    /**
     * @Transactional work only for runtime exceptions by defaul
     * it work for checked exception when you set rollbackFor=Exception.class
     */
    @Transactional(rollbackFor=Exception.class)
    public void insertTwo(){
        Woman womanA=new Woman();
        womanA.setAge(24);
        womanA.setCupSize("A");
        womanRepository.save(womanA);

        Woman womanB=new Woman();
        womanB.setAge(23);
        womanB.setCupSize("BBBBBBBBBBBBBBBBBBBBB");
        womanRepository.save(womanB);

    }
}
