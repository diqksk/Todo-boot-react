package chorong.baeksoo.todo.Member.dto;

import chorong.baeksoo.todo.Member.entity.Member;
import lombok.Getter;

@Getter
public class MemberResponseDto {

    private Long memberId;
    private String id;
    private String password;
    private String name;

    public MemberResponseDto(Member entity){
        this.memberId=entity.getMemberId();
        this.id= entity.getId();
        this.password= entity.getPassword();
        this.name=entity.getName();
    }
}
