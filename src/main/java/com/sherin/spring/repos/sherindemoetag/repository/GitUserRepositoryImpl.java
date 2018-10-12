package com.sherin.spring.repos.sherindemoetag.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;
import com.sherin.spring.repos.sherindemoetag.model.UserInfo;

@Repository
public class GitUserRepositoryImpl implements GitUserRepository {

  @Autowired
  RestTemplate restTemplate;

  private static final String GIT_USER_INFO_ENDPOINT = "https://api.github.com/users/spring";

  @Override
  public UserInfo getGitUserInfo() {
    return restTemplate.exchange(GIT_USER_INFO_ENDPOINT, HttpMethod.GET, null, UserInfo.class)
        .getBody();
  }

}
