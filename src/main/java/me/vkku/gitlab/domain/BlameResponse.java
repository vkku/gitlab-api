package me.vkku.gitlab.domain;

public class BlameResponse {
    private Commit commit;
    private List<String> lines;

    // Getters and setters
}


public class Commit {
    private String id;
    private String message;
    private List<String> parentIds;
    private String authoredDate;
    private String authorName;
    private String authorEmail;
    private String committedDate;
    private String committerName;
    private String committerEmail;

    // Getters and setters
}
