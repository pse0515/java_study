package com.korit.study.ch24_연습;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BoardMain {
    public static void main(String[] args) {
        // 게시판
        /**
         * [
         *      {
         *          "title": "게시판 제목1",
         *          "writer": {
         *              "name": "김준일",
         *              "age": 32
         *          },
         *          "content": "게시판 내용1",
         *          "comments": [
         *              {
         *                  "writer": "김준이",
         *                  "content": "댓글 내용1"
         *              },
         *              {
         *                  "writer": "김준삼",
         *                  "content": "댓글 내용2"
         *              },
         *          ]
         *      },
         *      {
         *          "title": "게시판 제목2",
         *          "writer": {
         *              "name": "김준사",
         *              "age": 34
         *          },
         *          "content": "게시판 내용2",
         *          "comments": [
         *              {
         *                  "writer": "김준오",
         *                  "content": "댓글 내용11"
         *              },
         *              {
         *                  "writer": "김준육",
         *                  "content": "댓글 내용22"
         *              },
         *          ]
         *      },
         * ]
         */

        //게시판 전체 리스트
        List<Map<String, Object>> BoardList = new ArrayList<>();

        // ------------ 게시글 1 -------------
        Map<String, Object> board1 = new HashMap<>();
        board1.put("title", "게시판 제목1");

        Map<String, Object> writer1 = new HashMap<>();
        writer1.put("name", "김준일");
        writer1.put("age", 32);
        board1.put("writer", writer1);

        board1.put("content", "게시판 내용1");

        List<Map<String, String>> comments1 = new ArrayList<>();
        Map<String, String> comments1_1 = new HashMap<>();
        comments1_1.put("writer","김준이");
        comments1_1.put("content", "댓글내용1");

        Map<String, String> comments1_2 = new HashMap<>();
        comments1_2.put("writer", "김준삼");
        comments1_2.put("content", "댓글내용2");

        comments1.add(comments1_1);
        comments1.add(comments1_2);
        board1.put("comments", comments1);


        //-------------게시글 2--------------
        Map<String, Object> board2 = new HashMap<>();
        board2.put("title", "게시판 제목2");

        Map<String, Object> writer2 = new HashMap<>();
        writer2.put("name", "김준사");
        writer2.put("age",34);
        board2.put("writer", writer2);

        board2.put("content", "게시판 내용2");

        List<Map<String, String>> comments2 = new ArrayList<>();
        Map<String, String> comments2_1 = new HashMap<>();
        comments2_1.put("writer", "김준오");
        comments2_1.put("content", "댓글내용11");

        Map<String, String> comments2_2 = new HashMap<>();
        comments2_2.put("writer", "김준육");
        comments2_2.put("content", "댓글내용22");
        comments2.add(comments2_1);
        comments2.add(comments2_2);

        board2.put("comments", comments2);






    }
}
