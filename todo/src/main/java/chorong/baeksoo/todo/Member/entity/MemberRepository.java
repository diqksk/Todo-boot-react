package chorong.baeksoo.todo.Member.entity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member,Long> { //<Entity클래스,PK타입>
}
