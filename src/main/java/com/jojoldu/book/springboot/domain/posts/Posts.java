package com.jojoldu.book.springboot.domain.posts;

import com.jojoldu.book.springboot.domain.BaseTimeEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@NoArgsConstructor(access = AccessLevel.PROTECTED) //기본 생성자 자동 추가
@Getter//Getter 메소드 자동 생성
@Entity //테이블과 링크될 클래스를 나타냄
public class Posts extends BaseTimeEntity {
    //실제 DB 테이블과 매칭될 클래스
    @Id//테이블의 PK 필드를 나타냄
    @GeneratedValue(strategy = GenerationType.IDENTITY)//PK 생성 규칙
    private Long id;

    @Column(length = 500,nullable =false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder//빌더 패턴 클래스 생성
    public Posts(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author =author;
    }

    public void update(String title, String content)
    {
        this.title = title;
        this.content = content;
    }

}
