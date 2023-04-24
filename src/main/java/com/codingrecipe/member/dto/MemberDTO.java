package com.codingrecipe.member.dto;

import com.codingrecipe.member.entity.MemberEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// Lombok에서 제공하는 어노테이션 (자동으로 해줌)
// 객체로 매개변수 만들기 위해 가짜 객체 만들어주기(View-html에서 입력받은 정보를 객체로 생성)
@Getter
@Setter
@NoArgsConstructor //기본생성자 자동
@ToString
public class MemberDTO {
    //html내 name과 DTO의 필드값이 동일하다면 spring이 DTO객체를 만들어서 set메서드로 정보를 만들어줌
    private Long id;
    private String memberEmail;
    private String memberPassword;
    private String memberName;

    //Entity -> DTO로 변환하는 메서드
    public static MemberDTO toMemberDTO(MemberEntity memberEntity) {
        MemberDTO memberDTO = new MemberDTO();
        memberDTO.setId(memberEntity.getId());
        memberDTO.setMemberEmail(memberEntity.getMemberEmail());
        memberDTO.setMemberPassword(memberEntity.getMemberPassword());
        memberDTO.setMemberName(memberEntity.getMemberName());

        return memberDTO;
    }
}
