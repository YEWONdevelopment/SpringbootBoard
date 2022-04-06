package com.example.kimEji.service;

import com.example.kimEji.domain.Board;
import com.example.kimEji.domain.BoardRepository;
import com.example.kimEji.web.dto.BoardResponseDto;
import com.example.kimEji.web.dto.BoardSaveDto;
import com.example.kimEji.web.dto.BoardUpdateDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class BoardService {

    private final BoardRepository boardRepository;

    @Transactional
    public Long save(BoardSaveDto saveDto){
        return boardRepository.save(saveDto.toEntity()).getId();
    }

    public BoardResponseDto findById(Long id){
        Board entity = boardRepository.findById(id).orElseThrow(() ->
                new IllegalArgumentException("해당 게시글이 없습니다. id=" + id));
        return new BoardResponseDto(entity);
    }

    @Transactional
    public Long update(Long id, BoardUpdateDto updateDto){
        Board board = boardRepository.findById(id).orElseThrow(() ->
                new IllegalArgumentException("해당 게시글이 없습니다. id=" + id));

        board.update(updateDto.getAge(),updateDto.getPhone());

        return id;
    }
}
