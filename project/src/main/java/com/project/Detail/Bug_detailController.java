package com.project.Detail;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class Bug_detailController {

    private final Bug_detailService Bug_detailService;

    @GetMapping("/detail/list")
    public String index(Model model) {
        List<Bug_detail> Bug_detailList = this.Bug_detailService.getList();
        model.addAttribute("Bug_detailList", Bug_detailList);
        return "Bug_detail_list";
    }

    @GetMapping(value = "/detail/{id}")
    public String detail(Model model, @PathVariable("id") Integer id) {
        Bug_detail Bug_detail = this.Bug_detailService.getBug_detail(id);
        model.addAttribute("Bug_detail", Bug_detail);
        return "Bug_detail_detail";
    }

    @PostMapping("/detail/search")
    public String searchBugs(@RequestParam String keyword, Model model) {
        List<Bug_detail> Bug_detailList = this.Bug_detailService.search(keyword);
        
        model.addAttribute("Bug_detailList", Bug_detailList);
        return "bug_detail_list";
    }
}
