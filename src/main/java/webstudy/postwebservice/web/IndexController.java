package webstudy.postwebservice.web;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import webstudy.postwebservice.service.posts.PostsService;
import webstudy.postwebservice.web.dto.PostsUpdateRequestDto;

@RequiredArgsConstructor
@Controller
public class IndexController {

    private final PostsService postsService;

    @GetMapping("/")
    public String index(Model model) {

        model.addAttribute("posts", postsService.findAllDesc());
        return "index";
    }

    @GetMapping("/posts/save")
    public String postsSave() {
        return "posts-save";
    }

    @PutMapping("/api/v1/posts/{id}")
    public Long update(@PathVariable Long id, @RequestBody
                       PostsUpdateRequestDto requestDto) {
        return postsService.update(id, requestDto);
    }
}
