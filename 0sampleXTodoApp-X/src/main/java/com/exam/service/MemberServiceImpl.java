package com.exam.service;

import com.exam.dto.MemberDTO;
import com.exam.mapper.MemberMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MemberServiceImpl implements MemberService {

    MemberMapper memberMapper;

    public MemberServiceImpl(MemberMapper memberMapper) {
        this.memberMapper = memberMapper;
    }

    @Transactional
    @Override
    public int signup(MemberDTO dto) {
        return memberMapper.signup(dto);
    }
}
