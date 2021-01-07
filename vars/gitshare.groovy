#!/usr/bin/env groovy

def call(String git_url,String gitbranch,String credentialsId,String stage ) {
  echo stage;
  def myUtils = new org.demo.gitutilits()
  myUtils.@stage(git_url,gitbranch)
    
}
