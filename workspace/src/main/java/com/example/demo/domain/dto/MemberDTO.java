package com.example.demo.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.validation.constraints.Pattern;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemberDTO {

    //@Pattern(regexp = "^[^@]*$", message = "회원 ID는 '@' 문자를 포함할 수 없습니다.")
    private String userId;
    //	회원 pw
    //@Pattern(regexp = "^(?=.*[a-zA-Z])(?=.*[!@#$%^*+=-])(?=.*[0-9]).{8,15}$", message = "비밀번호는 영소문자와 숫자, 특문을 포함한 8자 이상이여야 합니다.")
    private String userPw;
    //	회원 이름
    private String userName;
    //	우편번호
    private String userAddr1;
    //  주소
    private String userAddr2;
    //  상세 주소
    private String userAddr3;
    //@Pattern(regexp = "^[0-9]*$", message = "전화번호는 숫자만 가능합니다.")
    //	회원 전화번호
    private String userPhone;
    //	회원, 관리자(0,1)
    private int userRole;


}
