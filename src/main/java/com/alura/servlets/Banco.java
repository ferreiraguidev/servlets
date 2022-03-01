package com.alura.servlets;

import com.alura.servlets.model.Business;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {

    private static List<Business> list = new ArrayList<>();
    private static Integer seqKey = 1;


    public void add(Business business) {
        Banco.list.add(business);

    }

    public List<Business> getBusiness() {
        return Banco.list;
    }

    public void remove(Integer id) {
        Iterator<Business> it = list.iterator();
        while(it.hasNext()){
            Business bsn = it.next();

            if (bsn.getId().equals(id)) {
                it.remove();
            }
        }
    }

    public Business searchById(Integer id) {
        for (Business business : list){

            if(business.getId().equals(id)){
                return business;
            }
        }
        return null;
    }
}
