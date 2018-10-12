package com.sherin.spring.repos.sherindemoetag.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sherin.spring.repos.sherindemoetag.model.UserInfo;
import com.sherin.spring.repos.sherindemoetag.service.GitUserService;

@RestController
public class GitHubUserController {

  @Autowired
  private GitUserService gitUserService;

  @RequestMapping("/git/users/spring")
  private UserInfo getGitUserService() {
    return gitUserService.gitUserInfo();
  }

}
