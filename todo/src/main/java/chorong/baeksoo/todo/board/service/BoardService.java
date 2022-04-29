package chorong.baeksoo.todo.board.service;

import chorong.baeksoo.todo.board.dto.BoardListDto;
import chorong.baeksoo.todo.board.dto.BoardOptionDto;

public interface BoardService {
    BoardListDto getBoardList(BoardOptionDto boardOptionDto);

}
