package com.sherin.spring.repos.sherindemoetag.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sherin.spring.repos.sherindemoetag.model.UserInfo;
import com.sherin.spring.repos.sherindemoetag.repository.GitUserRepository;

@Service
public class GitUserServiceImpl implements GitUserService {

  @Autowired
  GitUserRepository gitUserRepository;

  @Override
  public UserInfo gitUserInfo() {

    return gitUserRepository.getGitUserInfo();
  }

}
