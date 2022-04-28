package chorong.baeksoo.todo.Member.entity;

import chorong.baeksoo.todo.common.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Member extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long memberId; // 멤버아이디 Board테이블에서 사용

    @Column(length = 100,nullable = false)
    private String id;

    @Column(length = 200,nullable = false)
    private String password;

    @Column(length = 100,nullable = false)
    private String name;

    @Builder
    public Member(Long memberId, String id, String password, String name){
        this.memberId = memberId;
        this.id=id;
        this.password=password;
        this.name=name;
    }

    public void update(String password,String name){
        this.password=password;
        this.name=name;
    }
    

}
