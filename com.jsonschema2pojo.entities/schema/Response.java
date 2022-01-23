
package schema;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "current_user_url",
    "current_user_authorizations_html_url",
    "authorizations_url",
    "code_search_url",
    "commit_search_url",
    "emails_url",
    "emojis_url",
    "events_url",
    "feeds_url",
    "followers_url",
    "following_url",
    "gists_url",
    "hub_url",
    "issue_search_url",
    "issues_url",
    "keys_url",
    "label_search_url",
    "notifications_url",
    "organization_url",
    "organization_repositories_url",
    "organization_teams_url",
    "public_gists_url",
    "rate_limit_url",
    "repository_url",
    "repository_search_url",
    "current_user_repositories_url",
    "starred_url",
    "starred_gists_url",
    "topic_search_url",
    "user_url",
    "user_organizations_url",
    "user_repositories_url",
    "user_search_url"
})
@Generated("jsonschema2pojo")
public class Response {

    @JsonProperty("current_user_url")
    private String currentUserUrl;
    @JsonProperty("current_user_authorizations_html_url")
    private String currentUserAuthorizationsHtmlUrl;
    @JsonProperty("authorizations_url")
    private String authorizationsUrl;
    @JsonProperty("code_search_url")
    private String codeSearchUrl;
    @JsonProperty("commit_search_url")
    private String commitSearchUrl;
    @JsonProperty("emails_url")
    private String emailsUrl;
    @JsonProperty("emojis_url")
    private String emojisUrl;
    @JsonProperty("events_url")
    private String eventsUrl;
    @JsonProperty("feeds_url")
    private String feedsUrl;
    @JsonProperty("followers_url")
    private String followersUrl;
    @JsonProperty("following_url")
    private String followingUrl;
    @JsonProperty("gists_url")
    private String gistsUrl;
    @JsonProperty("hub_url")
    private String hubUrl;
    @JsonProperty("issue_search_url")
    private String issueSearchUrl;
    @JsonProperty("issues_url")
    private String issuesUrl;
    @JsonProperty("keys_url")
    private String keysUrl;
    @JsonProperty("label_search_url")
    private String labelSearchUrl;
    @JsonProperty("notifications_url")
    private String notificationsUrl;
    @JsonProperty("organization_url")
    private String organizationUrl;
    @JsonProperty("organization_repositories_url")
    private String organizationRepositoriesUrl;
    @JsonProperty("organization_teams_url")
    private String organizationTeamsUrl;
    @JsonProperty("public_gists_url")
    private String publicGistsUrl;
    @JsonProperty("rate_limit_url")
    private String rateLimitUrl;
    @JsonProperty("repository_url")
    private String repositoryUrl;
    @JsonProperty("repository_search_url")
    private String repositorySearchUrl;
    @JsonProperty("current_user_repositories_url")
    private String currentUserRepositoriesUrl;
    @JsonProperty("starred_url")
    private String starredUrl;
    @JsonProperty("starred_gists_url")
    private String starredGistsUrl;
    @JsonProperty("topic_search_url")
    private String topicSearchUrl;
    @JsonProperty("user_url")
    private String userUrl;
    @JsonProperty("user_organizations_url")
    private String userOrganizationsUrl;
    @JsonProperty("user_repositories_url")
    private String userRepositoriesUrl;
    @JsonProperty("user_search_url")
    private String userSearchUrl;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("current_user_url")
    public String getCurrentUserUrl() {
        return currentUserUrl;
    }

    @JsonProperty("current_user_url")
    public void setCurrentUserUrl(String currentUserUrl) {
        this.currentUserUrl = currentUserUrl;
    }

    @JsonProperty("current_user_authorizations_html_url")
    public String getCurrentUserAuthorizationsHtmlUrl() {
        return currentUserAuthorizationsHtmlUrl;
    }

    @JsonProperty("current_user_authorizations_html_url")
    public void setCurrentUserAuthorizationsHtmlUrl(String currentUserAuthorizationsHtmlUrl) {
        this.currentUserAuthorizationsHtmlUrl = currentUserAuthorizationsHtmlUrl;
    }

    @JsonProperty("authorizations_url")
    public String getAuthorizationsUrl() {
        return authorizationsUrl;
    }

    @JsonProperty("authorizations_url")
    public void setAuthorizationsUrl(String authorizationsUrl) {
        this.authorizationsUrl = authorizationsUrl;
    }

    @JsonProperty("code_search_url")
    public String getCodeSearchUrl() {
        return codeSearchUrl;
    }

    @JsonProperty("code_search_url")
    public void setCodeSearchUrl(String codeSearchUrl) {
        this.codeSearchUrl = codeSearchUrl;
    }

    @JsonProperty("commit_search_url")
    public String getCommitSearchUrl() {
        return commitSearchUrl;
    }

    @JsonProperty("commit_search_url")
    public void setCommitSearchUrl(String commitSearchUrl) {
        this.commitSearchUrl = commitSearchUrl;
    }

    @JsonProperty("emails_url")
    public String getEmailsUrl() {
        return emailsUrl;
    }

    @JsonProperty("emails_url")
    public void setEmailsUrl(String emailsUrl) {
        this.emailsUrl = emailsUrl;
    }

    @JsonProperty("emojis_url")
    public String getEmojisUrl() {
        return emojisUrl;
    }

    @JsonProperty("emojis_url")
    public void setEmojisUrl(String emojisUrl) {
        this.emojisUrl = emojisUrl;
    }

    @JsonProperty("events_url")
    public String getEventsUrl() {
        return eventsUrl;
    }

    @JsonProperty("events_url")
    public void setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

    @JsonProperty("feeds_url")
    public String getFeedsUrl() {
        return feedsUrl;
    }

    @JsonProperty("feeds_url")
    public void setFeedsUrl(String feedsUrl) {
        this.feedsUrl = feedsUrl;
    }

    @JsonProperty("followers_url")
    public String getFollowersUrl() {
        return followersUrl;
    }

    @JsonProperty("followers_url")
    public void setFollowersUrl(String followersUrl) {
        this.followersUrl = followersUrl;
    }

    @JsonProperty("following_url")
    public String getFollowingUrl() {
        return followingUrl;
    }

    @JsonProperty("following_url")
    public void setFollowingUrl(String followingUrl) {
        this.followingUrl = followingUrl;
    }

    @JsonProperty("gists_url")
    public String getGistsUrl() {
        return gistsUrl;
    }

    @JsonProperty("gists_url")
    public void setGistsUrl(String gistsUrl) {
        this.gistsUrl = gistsUrl;
    }

    @JsonProperty("hub_url")
    public String getHubUrl() {
        return hubUrl;
    }

    @JsonProperty("hub_url")
    public void setHubUrl(String hubUrl) {
        this.hubUrl = hubUrl;
    }

    @JsonProperty("issue_search_url")
    public String getIssueSearchUrl() {
        return issueSearchUrl;
    }

    @JsonProperty("issue_search_url")
    public void setIssueSearchUrl(String issueSearchUrl) {
        this.issueSearchUrl = issueSearchUrl;
    }

    @JsonProperty("issues_url")
    public String getIssuesUrl() {
        return issuesUrl;
    }

    @JsonProperty("issues_url")
    public void setIssuesUrl(String issuesUrl) {
        this.issuesUrl = issuesUrl;
    }

    @JsonProperty("keys_url")
    public String getKeysUrl() {
        return keysUrl;
    }

    @JsonProperty("keys_url")
    public void setKeysUrl(String keysUrl) {
        this.keysUrl = keysUrl;
    }

    @JsonProperty("label_search_url")
    public String getLabelSearchUrl() {
        return labelSearchUrl;
    }

    @JsonProperty("label_search_url")
    public void setLabelSearchUrl(String labelSearchUrl) {
        this.labelSearchUrl = labelSearchUrl;
    }

    @JsonProperty("notifications_url")
    public String getNotificationsUrl() {
        return notificationsUrl;
    }

    @JsonProperty("notifications_url")
    public void setNotificationsUrl(String notificationsUrl) {
        this.notificationsUrl = notificationsUrl;
    }

    @JsonProperty("organization_url")
    public String getOrganizationUrl() {
        return organizationUrl;
    }

    @JsonProperty("organization_url")
    public void setOrganizationUrl(String organizationUrl) {
        this.organizationUrl = organizationUrl;
    }

    @JsonProperty("organization_repositories_url")
    public String getOrganizationRepositoriesUrl() {
        return organizationRepositoriesUrl;
    }

    @JsonProperty("organization_repositories_url")
    public void setOrganizationRepositoriesUrl(String organizationRepositoriesUrl) {
        this.organizationRepositoriesUrl = organizationRepositoriesUrl;
    }

    @JsonProperty("organization_teams_url")
    public String getOrganizationTeamsUrl() {
        return organizationTeamsUrl;
    }

    @JsonProperty("organization_teams_url")
    public void setOrganizationTeamsUrl(String organizationTeamsUrl) {
        this.organizationTeamsUrl = organizationTeamsUrl;
    }

    @JsonProperty("public_gists_url")
    public String getPublicGistsUrl() {
        return publicGistsUrl;
    }

    @JsonProperty("public_gists_url")
    public void setPublicGistsUrl(String publicGistsUrl) {
        this.publicGistsUrl = publicGistsUrl;
    }

    @JsonProperty("rate_limit_url")
    public String getRateLimitUrl() {
        return rateLimitUrl;
    }

    @JsonProperty("rate_limit_url")
    public void setRateLimitUrl(String rateLimitUrl) {
        this.rateLimitUrl = rateLimitUrl;
    }

    @JsonProperty("repository_url")
    public String getRepositoryUrl() {
        return repositoryUrl;
    }

    @JsonProperty("repository_url")
    public void setRepositoryUrl(String repositoryUrl) {
        this.repositoryUrl = repositoryUrl;
    }

    @JsonProperty("repository_search_url")
    public String getRepositorySearchUrl() {
        return repositorySearchUrl;
    }

    @JsonProperty("repository_search_url")
    public void setRepositorySearchUrl(String repositorySearchUrl) {
        this.repositorySearchUrl = repositorySearchUrl;
    }

    @JsonProperty("current_user_repositories_url")
    public String getCurrentUserRepositoriesUrl() {
        return currentUserRepositoriesUrl;
    }

    @JsonProperty("current_user_repositories_url")
    public void setCurrentUserRepositoriesUrl(String currentUserRepositoriesUrl) {
        this.currentUserRepositoriesUrl = currentUserRepositoriesUrl;
    }

    @JsonProperty("starred_url")
    public String getStarredUrl() {
        return starredUrl;
    }

    @JsonProperty("starred_url")
    public void setStarredUrl(String starredUrl) {
        this.starredUrl = starredUrl;
    }

    @JsonProperty("starred_gists_url")
    public String getStarredGistsUrl() {
        return starredGistsUrl;
    }

    @JsonProperty("starred_gists_url")
    public void setStarredGistsUrl(String starredGistsUrl) {
        this.starredGistsUrl = starredGistsUrl;
    }

    @JsonProperty("topic_search_url")
    public String getTopicSearchUrl() {
        return topicSearchUrl;
    }

    @JsonProperty("topic_search_url")
    public void setTopicSearchUrl(String topicSearchUrl) {
        this.topicSearchUrl = topicSearchUrl;
    }

    @JsonProperty("user_url")
    public String getUserUrl() {
        return userUrl;
    }

    @JsonProperty("user_url")
    public void setUserUrl(String userUrl) {
        this.userUrl = userUrl;
    }

    @JsonProperty("user_organizations_url")
    public String getUserOrganizationsUrl() {
        return userOrganizationsUrl;
    }

    @JsonProperty("user_organizations_url")
    public void setUserOrganizationsUrl(String userOrganizationsUrl) {
        this.userOrganizationsUrl = userOrganizationsUrl;
    }

    @JsonProperty("user_repositories_url")
    public String getUserRepositoriesUrl() {
        return userRepositoriesUrl;
    }

    @JsonProperty("user_repositories_url")
    public void setUserRepositoriesUrl(String userRepositoriesUrl) {
        this.userRepositoriesUrl = userRepositoriesUrl;
    }

    @JsonProperty("user_search_url")
    public String getUserSearchUrl() {
        return userSearchUrl;
    }

    @JsonProperty("user_search_url")
    public void setUserSearchUrl(String userSearchUrl) {
        this.userSearchUrl = userSearchUrl;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Response.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("currentUserUrl");
        sb.append('=');
        sb.append(((this.currentUserUrl == null)?"<null>":this.currentUserUrl));
        sb.append(',');
        sb.append("currentUserAuthorizationsHtmlUrl");
        sb.append('=');
        sb.append(((this.currentUserAuthorizationsHtmlUrl == null)?"<null>":this.currentUserAuthorizationsHtmlUrl));
        sb.append(',');
        sb.append("authorizationsUrl");
        sb.append('=');
        sb.append(((this.authorizationsUrl == null)?"<null>":this.authorizationsUrl));
        sb.append(',');
        sb.append("codeSearchUrl");
        sb.append('=');
        sb.append(((this.codeSearchUrl == null)?"<null>":this.codeSearchUrl));
        sb.append(',');
        sb.append("commitSearchUrl");
        sb.append('=');
        sb.append(((this.commitSearchUrl == null)?"<null>":this.commitSearchUrl));
        sb.append(',');
        sb.append("emailsUrl");
        sb.append('=');
        sb.append(((this.emailsUrl == null)?"<null>":this.emailsUrl));
        sb.append(',');
        sb.append("emojisUrl");
        sb.append('=');
        sb.append(((this.emojisUrl == null)?"<null>":this.emojisUrl));
        sb.append(',');
        sb.append("eventsUrl");
        sb.append('=');
        sb.append(((this.eventsUrl == null)?"<null>":this.eventsUrl));
        sb.append(',');
        sb.append("feedsUrl");
        sb.append('=');
        sb.append(((this.feedsUrl == null)?"<null>":this.feedsUrl));
        sb.append(',');
        sb.append("followersUrl");
        sb.append('=');
        sb.append(((this.followersUrl == null)?"<null>":this.followersUrl));
        sb.append(',');
        sb.append("followingUrl");
        sb.append('=');
        sb.append(((this.followingUrl == null)?"<null>":this.followingUrl));
        sb.append(',');
        sb.append("gistsUrl");
        sb.append('=');
        sb.append(((this.gistsUrl == null)?"<null>":this.gistsUrl));
        sb.append(',');
        sb.append("hubUrl");
        sb.append('=');
        sb.append(((this.hubUrl == null)?"<null>":this.hubUrl));
        sb.append(',');
        sb.append("issueSearchUrl");
        sb.append('=');
        sb.append(((this.issueSearchUrl == null)?"<null>":this.issueSearchUrl));
        sb.append(',');
        sb.append("issuesUrl");
        sb.append('=');
        sb.append(((this.issuesUrl == null)?"<null>":this.issuesUrl));
        sb.append(',');
        sb.append("keysUrl");
        sb.append('=');
        sb.append(((this.keysUrl == null)?"<null>":this.keysUrl));
        sb.append(',');
        sb.append("labelSearchUrl");
        sb.append('=');
        sb.append(((this.labelSearchUrl == null)?"<null>":this.labelSearchUrl));
        sb.append(',');
        sb.append("notificationsUrl");
        sb.append('=');
        sb.append(((this.notificationsUrl == null)?"<null>":this.notificationsUrl));
        sb.append(',');
        sb.append("organizationUrl");
        sb.append('=');
        sb.append(((this.organizationUrl == null)?"<null>":this.organizationUrl));
        sb.append(',');
        sb.append("organizationRepositoriesUrl");
        sb.append('=');
        sb.append(((this.organizationRepositoriesUrl == null)?"<null>":this.organizationRepositoriesUrl));
        sb.append(',');
        sb.append("organizationTeamsUrl");
        sb.append('=');
        sb.append(((this.organizationTeamsUrl == null)?"<null>":this.organizationTeamsUrl));
        sb.append(',');
        sb.append("publicGistsUrl");
        sb.append('=');
        sb.append(((this.publicGistsUrl == null)?"<null>":this.publicGistsUrl));
        sb.append(',');
        sb.append("rateLimitUrl");
        sb.append('=');
        sb.append(((this.rateLimitUrl == null)?"<null>":this.rateLimitUrl));
        sb.append(',');
        sb.append("repositoryUrl");
        sb.append('=');
        sb.append(((this.repositoryUrl == null)?"<null>":this.repositoryUrl));
        sb.append(',');
        sb.append("repositorySearchUrl");
        sb.append('=');
        sb.append(((this.repositorySearchUrl == null)?"<null>":this.repositorySearchUrl));
        sb.append(',');
        sb.append("currentUserRepositoriesUrl");
        sb.append('=');
        sb.append(((this.currentUserRepositoriesUrl == null)?"<null>":this.currentUserRepositoriesUrl));
        sb.append(',');
        sb.append("starredUrl");
        sb.append('=');
        sb.append(((this.starredUrl == null)?"<null>":this.starredUrl));
        sb.append(',');
        sb.append("starredGistsUrl");
        sb.append('=');
        sb.append(((this.starredGistsUrl == null)?"<null>":this.starredGistsUrl));
        sb.append(',');
        sb.append("topicSearchUrl");
        sb.append('=');
        sb.append(((this.topicSearchUrl == null)?"<null>":this.topicSearchUrl));
        sb.append(',');
        sb.append("userUrl");
        sb.append('=');
        sb.append(((this.userUrl == null)?"<null>":this.userUrl));
        sb.append(',');
        sb.append("userOrganizationsUrl");
        sb.append('=');
        sb.append(((this.userOrganizationsUrl == null)?"<null>":this.userOrganizationsUrl));
        sb.append(',');
        sb.append("userRepositoriesUrl");
        sb.append('=');
        sb.append(((this.userRepositoriesUrl == null)?"<null>":this.userRepositoriesUrl));
        sb.append(',');
        sb.append("userSearchUrl");
        sb.append('=');
        sb.append(((this.userSearchUrl == null)?"<null>":this.userSearchUrl));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.followingUrl == null)? 0 :this.followingUrl.hashCode()));
        result = ((result* 31)+((this.issueSearchUrl == null)? 0 :this.issueSearchUrl.hashCode()));
        result = ((result* 31)+((this.issuesUrl == null)? 0 :this.issuesUrl.hashCode()));
        result = ((result* 31)+((this.commitSearchUrl == null)? 0 :this.commitSearchUrl.hashCode()));
        result = ((result* 31)+((this.currentUserRepositoriesUrl == null)? 0 :this.currentUserRepositoriesUrl.hashCode()));
        result = ((result* 31)+((this.feedsUrl == null)? 0 :this.feedsUrl.hashCode()));
        result = ((result* 31)+((this.codeSearchUrl == null)? 0 :this.codeSearchUrl.hashCode()));
        result = ((result* 31)+((this.starredGistsUrl == null)? 0 :this.starredGistsUrl.hashCode()));
        result = ((result* 31)+((this.labelSearchUrl == null)? 0 :this.labelSearchUrl.hashCode()));
        result = ((result* 31)+((this.emojisUrl == null)? 0 :this.emojisUrl.hashCode()));
        result = ((result* 31)+((this.userSearchUrl == null)? 0 :this.userSearchUrl.hashCode()));
        result = ((result* 31)+((this.topicSearchUrl == null)? 0 :this.topicSearchUrl.hashCode()));
        result = ((result* 31)+((this.followersUrl == null)? 0 :this.followersUrl.hashCode()));
        result = ((result* 31)+((this.repositorySearchUrl == null)? 0 :this.repositorySearchUrl.hashCode()));
        result = ((result* 31)+((this.userOrganizationsUrl == null)? 0 :this.userOrganizationsUrl.hashCode()));
        result = ((result* 31)+((this.currentUserUrl == null)? 0 :this.currentUserUrl.hashCode()));
        result = ((result* 31)+((this.userUrl == null)? 0 :this.userUrl.hashCode()));
        result = ((result* 31)+((this.gistsUrl == null)? 0 :this.gistsUrl.hashCode()));
        result = ((result* 31)+((this.userRepositoriesUrl == null)? 0 :this.userRepositoriesUrl.hashCode()));
        result = ((result* 31)+((this.emailsUrl == null)? 0 :this.emailsUrl.hashCode()));
        result = ((result* 31)+((this.keysUrl == null)? 0 :this.keysUrl.hashCode()));
        result = ((result* 31)+((this.hubUrl == null)? 0 :this.hubUrl.hashCode()));
        result = ((result* 31)+((this.organizationUrl == null)? 0 :this.organizationUrl.hashCode()));
        result = ((result* 31)+((this.authorizationsUrl == null)? 0 :this.authorizationsUrl.hashCode()));
        result = ((result* 31)+((this.starredUrl == null)? 0 :this.starredUrl.hashCode()));
        result = ((result* 31)+((this.repositoryUrl == null)? 0 :this.repositoryUrl.hashCode()));
        result = ((result* 31)+((this.currentUserAuthorizationsHtmlUrl == null)? 0 :this.currentUserAuthorizationsHtmlUrl.hashCode()));
        result = ((result* 31)+((this.organizationTeamsUrl == null)? 0 :this.organizationTeamsUrl.hashCode()));
        result = ((result* 31)+((this.organizationRepositoriesUrl == null)? 0 :this.organizationRepositoriesUrl.hashCode()));
        result = ((result* 31)+((this.eventsUrl == null)? 0 :this.eventsUrl.hashCode()));
        result = ((result* 31)+((this.rateLimitUrl == null)? 0 :this.rateLimitUrl.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.notificationsUrl == null)? 0 :this.notificationsUrl.hashCode()));
        result = ((result* 31)+((this.publicGistsUrl == null)? 0 :this.publicGistsUrl.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Response) == false) {
            return false;
        }
        Response rhs = ((Response) other);
        return (((((((((((((((((((((((((((((((((((this.followingUrl == rhs.followingUrl)||((this.followingUrl!= null)&&this.followingUrl.equals(rhs.followingUrl)))&&((this.issueSearchUrl == rhs.issueSearchUrl)||((this.issueSearchUrl!= null)&&this.issueSearchUrl.equals(rhs.issueSearchUrl))))&&((this.issuesUrl == rhs.issuesUrl)||((this.issuesUrl!= null)&&this.issuesUrl.equals(rhs.issuesUrl))))&&((this.commitSearchUrl == rhs.commitSearchUrl)||((this.commitSearchUrl!= null)&&this.commitSearchUrl.equals(rhs.commitSearchUrl))))&&((this.currentUserRepositoriesUrl == rhs.currentUserRepositoriesUrl)||((this.currentUserRepositoriesUrl!= null)&&this.currentUserRepositoriesUrl.equals(rhs.currentUserRepositoriesUrl))))&&((this.feedsUrl == rhs.feedsUrl)||((this.feedsUrl!= null)&&this.feedsUrl.equals(rhs.feedsUrl))))&&((this.codeSearchUrl == rhs.codeSearchUrl)||((this.codeSearchUrl!= null)&&this.codeSearchUrl.equals(rhs.codeSearchUrl))))&&((this.starredGistsUrl == rhs.starredGistsUrl)||((this.starredGistsUrl!= null)&&this.starredGistsUrl.equals(rhs.starredGistsUrl))))&&((this.labelSearchUrl == rhs.labelSearchUrl)||((this.labelSearchUrl!= null)&&this.labelSearchUrl.equals(rhs.labelSearchUrl))))&&((this.emojisUrl == rhs.emojisUrl)||((this.emojisUrl!= null)&&this.emojisUrl.equals(rhs.emojisUrl))))&&((this.userSearchUrl == rhs.userSearchUrl)||((this.userSearchUrl!= null)&&this.userSearchUrl.equals(rhs.userSearchUrl))))&&((this.topicSearchUrl == rhs.topicSearchUrl)||((this.topicSearchUrl!= null)&&this.topicSearchUrl.equals(rhs.topicSearchUrl))))&&((this.followersUrl == rhs.followersUrl)||((this.followersUrl!= null)&&this.followersUrl.equals(rhs.followersUrl))))&&((this.repositorySearchUrl == rhs.repositorySearchUrl)||((this.repositorySearchUrl!= null)&&this.repositorySearchUrl.equals(rhs.repositorySearchUrl))))&&((this.userOrganizationsUrl == rhs.userOrganizationsUrl)||((this.userOrganizationsUrl!= null)&&this.userOrganizationsUrl.equals(rhs.userOrganizationsUrl))))&&((this.currentUserUrl == rhs.currentUserUrl)||((this.currentUserUrl!= null)&&this.currentUserUrl.equals(rhs.currentUserUrl))))&&((this.userUrl == rhs.userUrl)||((this.userUrl!= null)&&this.userUrl.equals(rhs.userUrl))))&&((this.gistsUrl == rhs.gistsUrl)||((this.gistsUrl!= null)&&this.gistsUrl.equals(rhs.gistsUrl))))&&((this.userRepositoriesUrl == rhs.userRepositoriesUrl)||((this.userRepositoriesUrl!= null)&&this.userRepositoriesUrl.equals(rhs.userRepositoriesUrl))))&&((this.emailsUrl == rhs.emailsUrl)||((this.emailsUrl!= null)&&this.emailsUrl.equals(rhs.emailsUrl))))&&((this.keysUrl == rhs.keysUrl)||((this.keysUrl!= null)&&this.keysUrl.equals(rhs.keysUrl))))&&((this.hubUrl == rhs.hubUrl)||((this.hubUrl!= null)&&this.hubUrl.equals(rhs.hubUrl))))&&((this.organizationUrl == rhs.organizationUrl)||((this.organizationUrl!= null)&&this.organizationUrl.equals(rhs.organizationUrl))))&&((this.authorizationsUrl == rhs.authorizationsUrl)||((this.authorizationsUrl!= null)&&this.authorizationsUrl.equals(rhs.authorizationsUrl))))&&((this.starredUrl == rhs.starredUrl)||((this.starredUrl!= null)&&this.starredUrl.equals(rhs.starredUrl))))&&((this.repositoryUrl == rhs.repositoryUrl)||((this.repositoryUrl!= null)&&this.repositoryUrl.equals(rhs.repositoryUrl))))&&((this.currentUserAuthorizationsHtmlUrl == rhs.currentUserAuthorizationsHtmlUrl)||((this.currentUserAuthorizationsHtmlUrl!= null)&&this.currentUserAuthorizationsHtmlUrl.equals(rhs.currentUserAuthorizationsHtmlUrl))))&&((this.organizationTeamsUrl == rhs.organizationTeamsUrl)||((this.organizationTeamsUrl!= null)&&this.organizationTeamsUrl.equals(rhs.organizationTeamsUrl))))&&((this.organizationRepositoriesUrl == rhs.organizationRepositoriesUrl)||((this.organizationRepositoriesUrl!= null)&&this.organizationRepositoriesUrl.equals(rhs.organizationRepositoriesUrl))))&&((this.eventsUrl == rhs.eventsUrl)||((this.eventsUrl!= null)&&this.eventsUrl.equals(rhs.eventsUrl))))&&((this.rateLimitUrl == rhs.rateLimitUrl)||((this.rateLimitUrl!= null)&&this.rateLimitUrl.equals(rhs.rateLimitUrl))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.notificationsUrl == rhs.notificationsUrl)||((this.notificationsUrl!= null)&&this.notificationsUrl.equals(rhs.notificationsUrl))))&&((this.publicGistsUrl == rhs.publicGistsUrl)||((this.publicGistsUrl!= null)&&this.publicGistsUrl.equals(rhs.publicGistsUrl))));
    }

}
