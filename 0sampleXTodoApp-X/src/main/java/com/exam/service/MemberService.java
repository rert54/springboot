package com.exam.service;

import com.exam.dto.MemberDTO;
import org.springframework.transaction.annotation.Transactional;

public interface MemberService {
    @Transactional
    int signup(MemberDTO dto);
}
