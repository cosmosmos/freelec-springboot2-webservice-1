package com.jojoldu.book.springboot.web.dto;

import com.jojoldu.book.springboot.domain.posts.Posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostsSaveRequestDto {
    private String title;
    private String content;
    private String author;
    @Builder
    public PostsSaveRequestDto(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }

    /*여기서 Entity 클래스인 Posts 클래스를 또 정의한 이유는
   Entity 클래스를 Request/Response 클래스로 사용하면 안되서
   Entity 클래스는 DB와 맞닿아 테이블 생성하고 스키마 변경되고 그러는데 화면 변경같은 빈번한 변경을
   테이블과 연결된 Entity 클래스를 변경하는 건 너무 큰 변경이다.
   Entity 클래스와 Controller에서 쓸 Dto는 분리해서 사용하기
   */
    public Posts toEntity(){
        return Posts.builder().
                title(title)
                .content(content)
                .author(author)
                .build();
    }
}
