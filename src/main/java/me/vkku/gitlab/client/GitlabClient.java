package me.vkku.gitlab.client;

import me.vkku.gitlab.domain.BlameResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

import static me.vkku.gitlab.utils.Constant.PRIVATE_TOKEN;

@FeignClient(name = "gitlab", url = "${gitlab.domain}/api/${gitlab.version}/projects")
public interface GitlabClient {

    @GetMapping("/{projectId}/repository/files/{urlEncodedFilePath}/blame?ref={branch}")
    List<BlameResponse> getBlame(@PathVariable String projectId, @PathVariable String urlEncodedFilePath, @PathVariable String branch, @RequestHeader(PRIVATE_TOKEN) String apikey);

}
