package chorong.baeksoo.todo.Member.dto;

import chorong.baeksoo.todo.Member.entity.Member;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class MemberSaveRequestDto {

    private String id;
    private String password;
    private String name;

    @Builder
    public MemberSaveRequestDto(String id,String password,String name){
        this.id=id;
        this.password=password;
        this.name=name;
    }

    public Member toEntity(){
        return Member.builder()
                .id(id)
                .password(password)
                .name(name)
                .build();
    }
}
