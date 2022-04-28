package chorong.baeksoo.todo.board.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BoardOptionDto {

    @Builder.Default
    private int page = 1; //요청페이지

    @Builder.Default
    private int size = 20; //요청개수

    private String type; //검색어 타입

    private String searchWord; //검색어

}
