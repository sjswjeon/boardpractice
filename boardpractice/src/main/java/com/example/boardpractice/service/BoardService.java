package com.example.boardpractice.service;

import com.example.boardpractice.model.Board;
import com.example.boardpractice.model.User;
import com.example.boardpractice.repository.BoardRepository;
import com.example.boardpractice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BoardRepository boardRepository;

    public Board save(String username, Board board) {
        User user = userRepository.findByUsername(username);
        board.setUser(user);
        return boardRepository.save(board);
    }
}
