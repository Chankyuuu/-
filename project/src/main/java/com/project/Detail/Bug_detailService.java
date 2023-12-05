package com.project.Detail;

import java.util.List;
import java.util.Optional;



import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class Bug_detailService {
    private final Bug_detailRepository Bug_detailRepository;

    public List<Bug_detail> getList() {
        return this.Bug_detailRepository.findAll();
    }

    public Bug_detail getBug_detail(Integer id) {  
        Optional<Bug_detail> Bug_detail = this.Bug_detailRepository.findById(id);
        return Bug_detail.get();
    }

    public List<Bug_detail> search(String keyword) {//
        return Bug_detailRepository.findByNameContainingOrDetailContaining(keyword, keyword);
    }
    
}
