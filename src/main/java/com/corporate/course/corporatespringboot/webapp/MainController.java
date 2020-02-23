package com.corporate.course.corporatespringboot.webapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import combibation.producer.model.bean.CombinationModel;

@RestController
public class MainController
{
    @Autowired
    private CombinationModel combinationModel;

    @RequestMapping(value = "/")
    public String getCombination()
    {
        return combinationModel.prettyPrintCombinations();
    }
}
