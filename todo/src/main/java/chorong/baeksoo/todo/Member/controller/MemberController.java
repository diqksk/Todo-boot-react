package chorong.baeksoo.todo.Member.controller;

import chorong.baeksoo.todo.Member.dto.MemberResponseDto;
import chorong.baeksoo.todo.Member.dto.MemberSaveRequestDto;
import chorong.baeksoo.todo.Member.dto.MemberUpdateRequestDto;
import chorong.baeksoo.todo.Member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/member/")
public class MemberController {

    private final MemberService memberService;

    @PostMapping("/save")
    public Long save(@RequestBody MemberSaveRequestDto requestDto){
        return memberService.save(requestDto);
    }

    @PutMapping("/api/{memberId}")
    public Long update(@PathVariable("memberId")Long memberId,@RequestBody MemberUpdateRequestDto requestDto){
        return memberService.update(memberId,requestDto);
    }

    @GetMapping("/api/{memberId}")
    public MemberResponseDto findById(@PathVariable("memberId")Long memberId){
        return memberService.findById(memberId);
    }

}
