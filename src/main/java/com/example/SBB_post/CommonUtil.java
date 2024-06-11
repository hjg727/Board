package com.example.SBB_post;

import org.commonmark.node.Node;
import org.commonmark.parser.Parser;
import org.commonmark.renderer.html.HtmlRenderer;
import org.springframework.stereotype.Component;

@Component
public class CommonUtil {
    public String markdown(String markdown) {
        Parser parser = Parser.builder().build();
        Node document = parser.parse(markdown);
        HtmlRenderer renderer = HtmlRenderer.builder().build();
        return renderer.render(document);
    }
}
/**
 * CommonUtil 클래스에는 markdown 메서드를 생성했다. markdown 메서드는 마크다운 텍스트를 HTML문서로 변환하여 리턴한다.
 * 즉, 마크다운 문법이 적용된 일반 텍스트를 반환된 "HTML"로 리턴한다.
 */