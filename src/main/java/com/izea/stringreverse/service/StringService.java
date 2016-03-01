package com.izea.stringreverse.service;

import org.springframework.stereotype.Service;

/**
 * Created by dvelma on 2/25/2016.
 */
@Service
public class StringService {
    public String reverse(String word){
        StringBuffer s=new StringBuffer(word);
        s.reverse();
        return ""+s;
    }
}
