package com.ead.authuser.services;

import org.springframework.data.domain.Pageable;

import java.util.UUID;

public interface UtilsService {

    String creatUrl(UUID userId, Pageable pageable);

}