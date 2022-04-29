package chorong.baeksoo.todo.board.controller;

import chorong.baeksoo.todo.board.dto.BoardListDto;
import chorong.baeksoo.todo.board.dto.BoardOptionDto;
import chorong.baeksoo.todo.board.service.BoardService;
import chorong.baeksoo.todo.common.util.ApiResponse.ApiResult;
import static chorong.baeksoo.todo.common.util.ApiResponse.success;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Log4j2
@RestController
@RequiredArgsConstructor
@RequestMapping("/board")
public class BoardController {

    private final BoardService boardService;

    @GetMapping("/")
    public ApiResult<BoardListDto> getBoards(BoardOptionDto boardOptionDto){

        BoardListDto boardList = boardService.getBoardList(boardOptionDto);

        return success(boardList);
    }
}
