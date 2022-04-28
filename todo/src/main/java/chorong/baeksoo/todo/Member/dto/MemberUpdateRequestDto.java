package chorong.baeksoo.todo.Member.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class MemberUpdateRequestDto {

    private String passoword;
    private String name;

    @Builder
    public MemberUpdateRequestDto(String passoword,String name){
        this.passoword=passoword;
        this.name=name;
    }
}
