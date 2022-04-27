package chorong.baeksoo.todo.board.entity;

import chorong.baeksoo.todo.common.entity.BaseEntity;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Builder
@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Board extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //게시글 넘버

    @NotNull
    @Column
    private Long memberId; //유저아이디 TODO: Member테이블 관계매핑

    @NotNull
    @Column
    private String title; //제목

    @NotNull
    @Column
    private String content; //세부내용

    @NotNull
    @Column
    private LocalDate targetDate; //목표일 YYYYMMDD(?)

    @NotNull
    @Column
    private boolean isDone = false; // 완료여부 (true: 완료, false: 미완료)

}
