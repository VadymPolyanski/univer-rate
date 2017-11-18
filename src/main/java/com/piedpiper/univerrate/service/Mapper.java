package com.piedpiper.univerrate.service;

import com.piedpiper.univerrate.dao.entity.UniversityEntity;
import com.piedpiper.univerrate.protocol.dto.UniversityDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class Mapper {

    private ModelMapper mapper = new ModelMapper();

    private UniversityDto mapUniversity(UniversityEntity entity) {
        return mapper.map(entity, UniversityDto.class);
    }

}
