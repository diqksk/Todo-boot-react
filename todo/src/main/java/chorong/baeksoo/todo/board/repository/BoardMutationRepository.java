package chorong.baeksoo.todo.board.repository;

import chorong.baeksoo.todo.board.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardMutationRepository extends JpaRepository<Board, String> {

}
