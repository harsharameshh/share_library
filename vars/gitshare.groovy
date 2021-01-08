#!/usr/bin/env groovy

def call(String git_url,String gitbranch,String credentialsId,String stage, String nodeOs ) {
  echo stage;
  echo new_branch;
  def myUtils = new org.demo.gitutilits()
  // def cl"osure = myUtils.&"stage"
  myUtils."$stage"(nodeOs,git_url,gitbranch)
    
}
