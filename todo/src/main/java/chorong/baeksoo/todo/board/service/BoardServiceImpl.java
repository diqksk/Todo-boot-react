package chorong.baeksoo.todo.board.service;

import chorong.baeksoo.todo.board.dto.BoardListDto;
import chorong.baeksoo.todo.board.dto.BoardOptionDto;
import chorong.baeksoo.todo.board.entity.Board;
import chorong.baeksoo.todo.board.repository.BoardMutationRepository;
import chorong.baeksoo.todo.board.repository.BoardQueryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService{

    private final BoardQueryRepository boardQueryRepository;
    private final BoardMutationRepository boardMutationRepository;

    @Override
    public BoardListDto getBoardList(BoardOptionDto boardOptionDto) {

        Pageable pageable = PageRequest.of(boardOptionDto.getPage() - 1, boardOptionDto.getSize());

        Page<Board> boardPage = boardQueryRepository.findAll(pageable);

        List<Board> board = boardPage.get().collect(Collectors.toList());

        return null;
    }
}
