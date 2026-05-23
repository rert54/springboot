package com.exam.service;

import com.exam.dto.MemberDTO;
import com.exam.mapper.MemberMapper;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class AuthenticationServiceImpl implements AuthenticationService{

    MemberMapper mapper;

    public AuthenticationServiceImpl(MemberMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public MemberDTO authenticate(Map<String,String> map){
        return mapper.authenticate(map);
    }
}
