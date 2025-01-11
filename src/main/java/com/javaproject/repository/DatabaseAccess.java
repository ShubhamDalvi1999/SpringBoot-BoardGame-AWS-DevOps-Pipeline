package com.javaproject.repository;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.javaproject.model.BoardGame;
import com.javaproject.model.Review;

@Repository
public class DatabaseAccess {
    
    public List<BoardGame> getBoardGames() {
        // Implementation will be provided by Spring JDBC
        return null;
    }

    public BoardGame getBoardGame(Long id) {
        // Implementation will be provided by Spring JDBC
        return null;
    }

    public Long addBoardGame(BoardGame boardGame) {
        // Implementation will be provided by Spring JDBC
        return null;
    }

    public List<Review> getReviews(Long boardgameId) {
        // Implementation will be provided by Spring JDBC
        return null;
    }
} 