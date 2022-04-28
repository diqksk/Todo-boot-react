package chorong.baeksoo.todo.Member.service;

import chorong.baeksoo.todo.Member.dto.MemberResponseDto;
import chorong.baeksoo.todo.Member.dto.MemberSaveRequestDto;
import chorong.baeksoo.todo.Member.dto.MemberUpdateRequestDto;
import chorong.baeksoo.todo.Member.entity.Member;
import chorong.baeksoo.todo.Member.entity.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    @Transactional
    public Long save(MemberSaveRequestDto requestDto){
        return memberRepository.save(requestDto.toEntity()).getMemberId();
    }

    @Transactional
    public Long update(Long memberId, MemberUpdateRequestDto requestDto){
        Member member = memberRepository.findById(memberId).orElseThrow(()->new IllegalArgumentException("해당 사용자가 없습니다. id="+memberId));
        member.update(requestDto.getPassoword(), requestDto.getName());
        return memberId;
    }

    @Transactional
    public MemberResponseDto findById(Long memberId){
        Member entity = memberRepository.findById(memberId).orElseThrow(()->new IllegalArgumentException("해당 사용자가 없습니다. id="+memberId));
        return new MemberResponseDto(entity);
    }


}
