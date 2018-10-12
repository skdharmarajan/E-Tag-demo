package com.sherin.spring.repos.sherindemoetag.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UserInfo {

  private String repos_url;

  public String getRepos_url() {
    return repos_url;
  }

  public void setRepos_url(String repos_url) {
    this.repos_url = repos_url;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((repos_url == null) ? 0 : repos_url.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    UserInfo other = (UserInfo) obj;
    if (repos_url == null) {
      if (other.repos_url != null)
        return false;
    } else if (!repos_url.equals(other.repos_url))
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "UserInfo [repos_url=" + repos_url + "]";
  }



}
