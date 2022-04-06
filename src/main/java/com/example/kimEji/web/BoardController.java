package com.example.kimEji.web;

import com.example.kimEji.service.BoardService;
import com.example.kimEji.web.dto.BoardResponseDto;
import com.example.kimEji.web.dto.BoardSaveDto;
import com.example.kimEji.web.dto.BoardUpdateDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class BoardController {

    private final BoardService boardService;

    @PostMapping("/board/save")
    public Long saveBoard(@RequestBody BoardSaveDto saveDto){
        return boardService.save(saveDto);
    }

    @GetMapping("/board/save/{id}")
    public BoardResponseDto findbyId(@PathVariable Long id) throws Exception {
        return boardService.findById(id);
    }

    @PutMapping ("/board/update/{id}")
    public Long updateBoard(@PathVariable Long id, @RequestBody BoardUpdateDto updateDto) {
        return boardService.update(id,updateDto);
    }

}
