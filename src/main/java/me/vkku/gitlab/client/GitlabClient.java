package me.vkku.gitlab.client;

import feign.Headers;
import me.vkku.gitlab.domain.BlameResponse;
import me.vkku.gitlab.utils.Constant;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import static me.vkku.gitlab.utils.Constant.PRIVATE_TOKEN;

@FeignClient(url = "${gitlab.domain}/api/${gitlab.version}/projects")
public interface GitlabClient {

    @GetMapping("/{projectId}/repository/files/{urlEncodedFilePath}/blame?ref={branch}")
    BlameResponse getBlame(@RequestHeader(PRIVATE_TOKEN) String apikey, String projectId, String urlEncodedFilePath, String branch);

}
