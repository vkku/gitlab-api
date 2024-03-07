package me.vkku.gitlab.service;

import lombok.RequiredArgsConstructor;
import me.vkku.gitlab.client.GitlabClient;
import me.vkku.gitlab.domain.BlameResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GitlabService {

    @Value("${gitlab.apikey}")
    String apikey;

    GitlabClient gitlabClient;

    public BlameResponse getBlame(String projectId, String urlEncodedFilePath, String branch) {
        return gitlabClient.getBlame(apikey, projectId, urlEncodedFilePath, branch);
    }
}
