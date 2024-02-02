package com.example.democlase.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
    public class userService {

        @Autowired
        private UserRestApi userRestApi;

        public List<String> getUsuarios() {
            return userRestApi.getUsuarios();
        }



    }


