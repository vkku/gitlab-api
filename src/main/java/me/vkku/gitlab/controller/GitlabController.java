package me.vkku.gitlab.controller;

import lombok.RequiredArgsConstructor;
import me.vkku.gitlab.domain.BlameResponse;
import me.vkku.gitlab.service.GitlabService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/git")
@RequiredArgsConstructor
public class GitlabController {

    GitlabService gitlabService;

    @GetMapping("/blame")
    public BlameResponse getBlame(@PathVariable String projectId, @PathVariable String urlEncodedFilePath, @PathVariable String branch){
        return gitlabService.getBlame(projectId, urlEncodedFilePath, branch);
    }
}
