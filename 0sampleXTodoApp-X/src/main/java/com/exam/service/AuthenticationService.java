package com.exam.service;

import java.util.Map;
import com.exam.dto.MemberDTO;
public interface AuthenticationService {

    MemberDTO authenticate(Map<String,String> map);
}
