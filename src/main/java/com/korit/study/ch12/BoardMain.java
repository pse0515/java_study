package com.korit.study.ch12;

public class BoardMain {
    public static void main(String[] args) {
        // Board배열 - boards -> 게시글 2개

        //Board - id(정수), title(문자열), contents(문자열), writer(Writer), comments(Comment[])

        //Writer - id(정수), name(문자열)

        //Comment - id(정수), contents(문자열), writer(Writer)



        Writer[] writers = new Writer[3];
        writers[0] = new Writer(1, "김준일");
        writers[1] = new Writer(1, "김준이");
        writers[2] = new Writer(1, "김준삼");

        Comment[][] comments = new Comment[2][];
        comments[0] = new Comment[3];
        comments[1] = new Comment[3];
        comments[0][0] = new Comment(1, "게시글1의 댓글1", writers[0]);
        comments[0][1] = new Comment(2, "게시글1의 댓글2", writers[0]);
        comments[0][2] = new Comment(3, "게시글1의 댓글3", writers[2]);
        comments[1][0] = new Comment(1, "게시글2의 댓글1", writers[1]);
        comments[1][1] = new Comment(2, "게시글2의 댓글2", writers[0]);
        comments[1][2] = new Comment(3, "게시글2의 댓글3", writers[2]);

        Board[] boards = new Board[2];
        boards[0] = new Board(1, "테스트 게시글1", "테스트 게시글 내용1",writers[1], comments[0]);
        boards[1] = new Board(2, "테스트 게시글1", "테스트 게시글 내용1",writers[1], comments[1]);

        BoardPrintService boardPrintService = new BoardPrintService();
        boardPrintService.printAll(boards);


    }
}
