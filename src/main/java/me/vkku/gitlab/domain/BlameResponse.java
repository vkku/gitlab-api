package me.vkku.gitlab.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
public class BlameResponse {
    private Commit commit;
    private List<String> lines;
}

@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
class Commit {
    private String id;
    private String message;
    @JsonProperty("parent_ids")
    private List<String> parentIds;
    @JsonProperty("authored_date")
    private String authoredDate;
    @JsonProperty("author_name")
    private String authorName;
    @JsonProperty("author_email")
    private String authorEmail;
    @JsonProperty("committed_date")
    private String committedDate;
    @JsonProperty("committer_name")
    private String committerName;
    @JsonProperty("committer_email")
    private String committerEmail;
}
