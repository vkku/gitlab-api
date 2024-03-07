package me.vkku.gitlab.service;

import lombok.RequiredArgsConstructor;
import me.vkku.gitlab.client.GitlabClient;
import me.vkku.gitlab.domain.BlameResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GitlabService {

    @Value("${gitlab.apikey}")
    private String apikey;

    private final GitlabClient gitlabClient;

    public List<BlameResponse> getBlame(String projectId, String urlEncodedFilePath, String branch) {
        return gitlabClient.getBlame(projectId, urlEncodedFilePath, branch, apikey);
    }
}
