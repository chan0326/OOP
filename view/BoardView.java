package view;

import builder.BoardBuilder;
import model.BoardDto;
import service.UtilService;
import serviceimpl.UtilServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class BoardView {
    public static void main() {
        List<BoardDto> articles = new ArrayList<>();
        UtilService utile = UtilServiceImpl.getInstance();




        for ( int i=0; i<5; i++){
            articles.add(new BoardBuilder()
                    .title(utile.creatRandomTitle())
                    .content(utile.creatRandomContnt())
                    .writer(utile.creatRadomName())

                    .build());
        }
// 처음부터 끝까지 돌릴때 사용
        articles.forEach( i ->{
            System.out.println(i.toString());
        });

        }

    }

